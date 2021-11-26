package com.wigilabs.testback.controller;

import com.wigilabs.testback.model.Pelicula;
import com.wigilabs.testback.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/pelicula")
public class PeliculaController {

    @Autowired
    PeliculaService peliculaService;

    @GetMapping
    private List<Pelicula> listarPeliculas(){
        return peliculaService.listarPeliculas();
    }

    @PostMapping
    private Pelicula guardarPelicula(@RequestBody Pelicula pelicula){
        peliculaService.guardarPelicula(pelicula);
        return pelicula;
    }

    @PutMapping
    private Pelicula actualizarPelicula(@RequestBody Pelicula pelicula){
        peliculaService.actualizarPelicula(pelicula);
        return pelicula;
    }

    @DeleteMapping("/{id}")
    private void eliminarPelicula(@PathVariable("id") int id){
        peliculaService.eliminarPelicula(id);
    }
}
