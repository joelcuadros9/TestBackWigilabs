package com.wigilabs.testback.service;

import com.wigilabs.testback.model.Pelicula;
import com.wigilabs.testback.model.Serie;
import com.wigilabs.testback.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SerieService {

    @Autowired
    SerieRepository serieRepository;

    public List<Serie> listarSeries(){
        List<Serie> series = new ArrayList<Serie>();
        serieRepository.findAllByOrderByIdDesc().forEach(serie -> series.add(serie));
        return series;
    }

    public void guardarSerie(Serie serie) {
        serieRepository.save(serie);
    }

    public void actualizarSerie(Serie serie) {
        serieRepository.save(serie);
    }

    public void eliminarSerie(int id) {
        serieRepository.deleteById(id);
    }
}
