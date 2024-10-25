/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practica3.dao;

import com.Practica3.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dques
 */
public interface ArbolDao extends JpaRepository<Arbol, Long>{
    
}