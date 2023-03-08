/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.Service;

import com.Cinelitas.Cinelitas.Entity.Pelicula;
import com.Cinelitas.Cinelitas.Repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tannyagranados
 */

@Service
public class PeliculaService implements IPeliculaService{

    @Autowired
    private PeliculaRepository peliculaRepository;
    
    @Override
    public List<Pelicula> listar() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }

    @Override
    public Pelicula getPeliculaById(int id) {
       return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public int save(Pelicula pelicula) {
        int res =0;
        Pelicula p = peliculaRepository.save(pelicula);
        if(!p.equals(null)){
            res =1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        peliculaRepository.deleteById(id);
    }
    
}
