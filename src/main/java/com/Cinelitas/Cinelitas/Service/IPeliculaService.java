/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Cinelitas.Cinelitas.Service;

import com.Cinelitas.Cinelitas.Entity.Pelicula;
import java.util.List;

/**
 *
 * @author tannyagranados
 */
public interface IPeliculaService {
    
    public List<Pelicula> listar(); 
    public Pelicula getPeliculaById(int id);
    public int save(Pelicula pelicula);
    public void delete(int id);
}
