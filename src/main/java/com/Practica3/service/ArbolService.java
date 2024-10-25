/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Practica3.service;

import com.Practica3.domain.Arbol;
import java.util.List;

/**
 *
 * @author dques
 */
public interface ArbolService {
    
    // Se obtiene un listado de categorias en un List
    public List<Arbol> getArboles(boolean activos);
    
}
