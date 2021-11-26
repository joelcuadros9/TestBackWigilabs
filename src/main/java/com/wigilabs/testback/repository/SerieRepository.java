package com.wigilabs.testback.repository;

import com.wigilabs.testback.model.Serie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SerieRepository extends CrudRepository<Serie, Integer> {
    public List<Serie> findAllByOrderByIdDesc();
}
