package com.wigilabs.testback.service;

import com.wigilabs.testback.model.Pelicula;
import com.wigilabs.testback.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeliculaService {

    @Autowired
    PeliculaRepository peliculaRepository;

    public List<Pelicula> listarPeliculas(){
        List<Pelicula> peliculas = new ArrayList<Pelicula>();
        peliculaRepository.findAllByOrderByIdDesc().forEach(pelicula -> peliculas.add(pelicula));
        return peliculas;
    }

    public void guardarPelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    public void actualizarPelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    public void eliminarPelicula(int id) {
        peliculaRepository.deleteById(id);
    }
}
