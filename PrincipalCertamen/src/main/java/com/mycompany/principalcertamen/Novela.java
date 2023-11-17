/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalcertamen;



/**
 *
 * @author franc
 */
//import java.util.List;

public class Novela extends Libro {

    public Novela(String codigo, String titulo, String autor, double precio, TipoNovela tipoNovela) {
        super(codigo, titulo, autor, precio, TipoLibro.NOVELA);
    }

    // Método específico de Novela para buscar
    /*public static Novela buscarLibro(List<Novela> listaLibros, String codigo) {
        for (Novela novela : listaLibros) {
            if (novela.getCodigo().equals(codigo)) {
                return novela;
            }
        }
        return null;
    }*/
}

