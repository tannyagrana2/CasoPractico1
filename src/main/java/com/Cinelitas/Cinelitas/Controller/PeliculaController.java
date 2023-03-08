/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.Controller;

import com.Cinelitas.Cinelitas.Entity.Pelicula;
import com.Cinelitas.Cinelitas.Service.IPeliculaService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author tannyagranados
 */

@Controller
public class PeliculaController {
    
    @Autowired
    private IPeliculaService peliculaService;

    
    @RequestMapping("/home")
    public String defectDetails() {
        return "home"; //defect-details.html page name to open it
    }
    
     @GetMapping("/peliculas")
    public String listar(Model model) {
        List<Pelicula> listaPeliculas = peliculaService.listar();
        model.addAttribute("titulo", "Tabla de Películas");
        model.addAttribute("pelicula", listaPeliculas);
        return "peliculas";
    }
    
    @GetMapping("/agregar") //Añadir método para agregar
    public String add(Model model) {
        model.addAttribute("titulo", "Agregar Nueva Película");
        model.addAttribute("pelicula", new Pelicula());
        return "agregar";
    }
    
    @PostMapping("/save")
    public String save(@Valid Pelicula p, Model model){
        peliculaService.save(p);
        return "redirect:/peliculas";
    }
    
    @GetMapping("/delete/{id_pelicula}")
    public String delete(Model model, @PathVariable int id_pelicula){
        peliculaService.delete(id_pelicula);
        return "redirect:/peliculas";
    }
    
    
}
