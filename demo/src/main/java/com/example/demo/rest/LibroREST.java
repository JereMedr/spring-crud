package com.example.demo.rest;

import com.example.demo.model.Libro;
import com.example.demo.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro/")
public class LibroREST {
    @Autowired
    private LibroService libroService;

    @GetMapping
    private ResponseEntity<List<Libro>> getAllLibros() {
        try {
            return ResponseEntity.ok(libroService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("{paginas}")
    private ResponseEntity<Object> getAllLibrosPaginasMultiplicadas(@PathVariable("paginas") int paginas) {
        try {
            return ResponseEntity.ok(libroService.findAllByPaginasMultiplicadas(paginas));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @PostMapping
    private ResponseEntity<Libro> saveLibro(@RequestBody Libro libro) {
        try {
            return ResponseEntity.ok(libroService.save(libro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping
    private ResponseEntity<Void> deleteLibro(@RequestBody Libro libro) {
        try {
            libroService.delete(libro);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
