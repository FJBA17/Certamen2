/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalcertamen;

/**
 *
 * @author franc
 */
public class LibroAcademico extends Libro {
    private String genero;
    public LibroAcademico(String codigo, String titulo, String autor, double precio, String genero) {
        super(codigo, titulo, autor, precio, TipoLibro.ACADEMICO);
        this.genero = genero;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
