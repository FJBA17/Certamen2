/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalcertamen;

/**
 *
 * @author franc
 */
import java.util.List;

public class LibroTexto extends Libro {
    private Escuela escuela;

    public LibroTexto(String codigo, String titulo, String autor, double precio, Escuela escuela) {
        super(codigo, titulo, autor, precio, TipoLibro.LIBRO_TEXTO);
        this.escuela = escuela;
    }

    // Método específico de LibroTexto para buscar
    /*public static LibroTexto buscarLibro(List<LibroTexto> listaLibros, String codigo) {
        for (LibroTexto libroTexto : listaLibros) {
            if (libroTexto.getCodigo().equals(codigo)) {
                return libroTexto;
            }
        }
        return null;
    }*/
}

