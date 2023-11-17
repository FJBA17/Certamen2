/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalcertamen;

import java.util.List;

public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private double precio;
    private TipoLibro tipoLibro;

    public Libro(String codigo, String titulo, String autor, double precio, TipoLibro tipoLibro) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.tipoLibro = tipoLibro;
    }

    public String getCodigo() {
        return codigo;
    }

    public static Libro buscarLibro(List<? extends Libro> listaLibros, String codigo) {
        for (Libro libro : listaLibros) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", tipoLibro=" + tipoLibro +
                '}';
    }
}




