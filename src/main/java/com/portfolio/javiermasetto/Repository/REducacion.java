/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.javiermasetto.Repository;

import com.portfolio.javiermasetto.Entity.Educacion;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Javier
 */
public interface REducacion {

    public List<Educacion> findAll();

    public Optional<Educacion> findById(int id);

    public Optional<Educacion> findByNombreE(String nombreE);

    public void save(Educacion educacion);

    public void deleteById(int id);

    public boolean existsById(int id);

    public boolean existsByNombreE(String nombreE);
    
}
