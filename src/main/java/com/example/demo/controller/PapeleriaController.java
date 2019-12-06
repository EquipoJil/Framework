package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Papeleria;
import com.example.demo.repository.PapeleriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PapeleriaController {
    @Autowired
    PapeleriaRepository papeleriaRepository;

    @GetMapping("/papelerias")
    public List<Papeleria> getAllPapeleria() {
        return papeleriaRepository.findAll();
    }


//    @GetMapping("/productosbynombre/{nombre}")
//    public List<Producto> getAllProductosByNombre(@PathVariable(value = "nombre") String nombre) {
////        return productoRepository.spproductosearch(nombre);
//        return productoRepository.findByName(nombre);
//    }

    @PostMapping("/papelerias")
    public Papeleria createPapeleria(@Valid @RequestBody Papeleria papeleria) {
        return papeleriaRepository.saveAndFlush(papeleria);
    }

    @GetMapping("/papelerias/{id}")
    public Papeleria getPapeleriaById(@PathVariable(value = "id") Long papeleriaId) {
        return papeleriaRepository.findById(papeleriaId)
                .orElseThrow(() -> new ResourceNotFoundException("Papeleria", "id", papeleriaId));
    }

    @PutMapping("/papelerias/{id}")
    public Papeleria updatePapelerias(@PathVariable(value = "id") Long papeleriaId,
                                           @Valid @RequestBody Papeleria papeleriaDetails) {
        Papeleria papeleria = papeleriaRepository.findById(papeleriaId)
                .orElseThrow(() -> new ResourceNotFoundException("Papeleria", "id", papeleriaId));
        papeleria.nombre = papeleriaDetails.nombre;
        papeleria.descripcion = papeleriaDetails.descripcion;
        papeleria.precio = papeleriaDetails.precio;

        Papeleria updatedPapeleria = papeleriaRepository.saveAndFlush(papeleria);
        return updatedPapeleria;
    }

    @DeleteMapping("/papelerias/{id}")
    public ResponseEntity<?> deletePapeleria(@PathVariable(value = "id") Long papeleriaId) {
        Papeleria papeleria = papeleriaRepository.findById(papeleriaId)
                .orElseThrow(() -> new ResourceNotFoundException("Papeleria", "id", papeleriaId));
        papeleriaRepository.delete(papeleria);
        return ResponseEntity.ok().build();
    }
}
