package com.Practica3.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable{
        
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String nombre_comun;
    private String tipo_flor;
    private String dureza_madera;
    private float altura_promedio;
    private String ruta_imagen;
    private boolean activos;

    public Arbol() {
    }

    public Arbol(Long id, String nombre_comun, String tipo_flor, String dureza_madera, float altura_promedio, String ruta_imagen, boolean activos) {
        this.id = id;
        this.nombre_comun = nombre_comun;
        this.tipo_flor = tipo_flor;
        this.dureza_madera = dureza_madera;
        this.altura_promedio = altura_promedio;
        this.ruta_imagen = ruta_imagen;
        this.activos = activos;
    }



    
    
    
}
