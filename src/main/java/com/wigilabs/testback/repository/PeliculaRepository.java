package com.wigilabs.testback.repository;

import com.wigilabs.testback.model.Pelicula;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PeliculaRepository extends CrudRepository<Pelicula, Integer> {
    public List<Pelicula> findAllByOrderByIdDesc();
}
