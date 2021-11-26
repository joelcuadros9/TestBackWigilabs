package com.wigilabs.testback.controller;

import com.wigilabs.testback.model.Pelicula;
import com.wigilabs.testback.model.Serie;
import com.wigilabs.testback.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/serie")
public class SerieController {

    @Autowired
    SerieService serieService;

    @GetMapping
    private List<Serie> listarSeries(){
        return serieService.listarSeries();
    }

    @PostMapping
    private Serie guardarSerie(@RequestBody Serie serie){
        serieService.guardarSerie(serie);
        return serie;
    }

    @PutMapping
    private Serie actualizarPelicula(@RequestBody Serie serie){
        serieService.actualizarSerie(serie);
        return serie;
    }

    @DeleteMapping("/{id}")
    private void eliminarSerie(@PathVariable("id") int id){
        serieService.eliminarSerie(id);
    }
}
