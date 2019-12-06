package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Electronico;
import com.example.demo.model.Producto;
import com.example.demo.repository.ElectronicoRepository;
import com.example.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ElectronicoController {
    @Autowired
    ElectronicoRepository electronicoRepository;

    @GetMapping("/electronicos")
    public List<Electronico> getAllElectronicos() {return electronicoRepository.findAll();
    }


//    @GetMapping("/productosbynombre/{nombre}")
//    public List<Producto> getAllProductosByNombre(@PathVariable(value = "nombre") String nombre) {
////        return productoRepository.spproductosearch(nombre);
//        return productoRepository.findByName(nombre);
//    }

    @PostMapping("/electronicos")
    public Electronico createElectronico(@Valid @RequestBody Electronico electronico) {
        return electronicoRepository.saveAndFlush(electronico);
    }

    @GetMapping("/electronicos/{id}")
    public Electronico getElectronicoById(@PathVariable(value = "id") Long electronicoId) {
        return electronicoRepository.findById(electronicoId)
                .orElseThrow(() -> new ResourceNotFoundException("Electronico", "id", electronicoId));
    }

    @PutMapping("/electronicos/{id}")
    public Electronico updateElectronico(@PathVariable(value = "id") Long electronicoId,
                                           @Valid @RequestBody Electronico electronicoDetails) {
        Electronico electronico = electronicoRepository.findById(electronicoId)
                .orElseThrow(() -> new ResourceNotFoundException("Electronico", "id", electronicoId));
        electronico.nombre = electronicoDetails.nombre;
        electronico.marca = electronicoDetails.marca;
        electronico.modelo = electronicoDetails.modelo;
        electronico.descripcion = electronicoDetails.descripcion;

        Electronico updatedElectronico = electronicoRepository.saveAndFlush(electronico);
        return updatedElectronico;
    }

    @DeleteMapping("/electronicos/{id}")
    public ResponseEntity<?> deleteElectronico(@PathVariable(value = "id") Long electronicoId) {
        Electronico electronico = electronicoRepository.findById(electronicoId)
                .orElseThrow(() -> new ResourceNotFoundException("Electronico", "id", electronicoId));
        electronicoRepository.delete(electronico);
        return ResponseEntity.ok().build();
    }
}
