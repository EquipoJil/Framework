package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Producto;
import com.example.demo.model.Telefono;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.repository.TelefonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TelefonoController {
    @Autowired
    TelefonoRepository telefonoRepository;

    @GetMapping("/telefonos")
    public List<Telefono> getAllTelefonos() {
        return telefonoRepository.findAll();
    }


//    @GetMapping("/productosbynombre/{nombre}")
//    public List<Producto> getAllProductosByNombre(@PathVariable(value = "nombre") String nombre) {
////        return productoRepository.spproductosearch(nombre);
//        return productoRepository.findByName(nombre);
//    }

    @PostMapping("/telefonos")
    public Telefono createTelefono(@Valid @RequestBody Telefono telefono) {
        return telefonoRepository.saveAndFlush(telefono);
    }

    @GetMapping("/telefonos/{id}")
    public Telefono getTelefonoById(@PathVariable(value = "id") Long telefonoId) {
        return telefonoRepository.findById(telefonoId)
                .orElseThrow(() -> new ResourceNotFoundException("Telefono", "id", telefonoId));
    }

    @PutMapping("/telefonos/{id}")
    public Telefono updateTelefono(@PathVariable(value = "id") Long telefonoId,
                                           @Valid @RequestBody Telefono telefonoDetails) {
        Telefono telefono = telefonoRepository.findById(telefonoId)
                .orElseThrow(() -> new ResourceNotFoundException("Telefono", "id", telefonoId));

        telefono.marca = telefonoDetails.marca;
        telefono.modelo = telefonoDetails.modelo;
        telefono.descripcion = telefonoDetails.descripcion;
        telefono.precio = telefonoDetails.precio;

        Telefono updatedTelefono = telefonoRepository.saveAndFlush(telefono);
        return updatedTelefono;
    }

    @DeleteMapping("/telefonos/{id}")
    public ResponseEntity<?> deleteTelefono(@PathVariable(value = "id") Long telefonoId) {
        Telefono telefono = telefonoRepository.findById(telefonoId)
                .orElseThrow(() -> new ResourceNotFoundException("Telefono", "id", telefonoId));
        telefonoRepository.delete(telefono);
        return ResponseEntity.ok().build();
    }
}
