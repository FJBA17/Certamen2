/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principalcertamen;

/**
 *
 * @author franc
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalCertamen {
    public static void main(String[] args) {
        List<LibroAcademico> librosAcademicos = new ArrayList<>();
        List<Novela> novelas = new ArrayList<>();
        List<LibroTexto> librosTexto = new ArrayList<>();

        // Insertar libros en las listas específicas
        insertarLibroAcademico(librosAcademicos, "001", "Libro Académico 1", "Autor1", 29.99);
        insertarNovela(novelas, "002", "Novela Romántica", "Autor2", 19.99, TipoNovela.ROMANTICA);
        insertarNovela(novelas, "005", "Novela Romántica", "jUAN", 19.99, TipoNovela.ROMANTICA);
        insertarLibroTexto(librosTexto, "003", "Libro de Texto PUCV", "Autor3", 39.99, Escuela.INGENIERIA);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el código del libro académico que deseas buscar: ");
            String codigoBuscado = scanner.nextLine();
            
            // Buscar en la lista específica según el tipo de libro
            LibroAcademico libroAcademicoEncontrado = (LibroAcademico) LibroAcademico.buscarLibro(librosAcademicos, codigoBuscado);
            Novela novelaEncontrada = (Novela) Novela.buscarLibro(novelas, codigoBuscado);
            LibroTexto libroTextoEncontrado = (LibroTexto) LibroTexto.buscarLibro(librosTexto, codigoBuscado);
            
            // Imprimir resultados000202
            if (libroAcademicoEncontrado != null) {
                System.out.println("Libro académico encontrado: " + libroAcademicoEncontrado);
            } else if (novelaEncontrada != null) {
                System.out.println("Novela encontrada: " + novelaEncontrada);
            } else if (libroTextoEncontrado != null) {
                System.out.println("Libro de texto encontrado: " + libroTextoEncontrado);
            } else {
                System.out.println("Libro no encontrado");
            }
        }
    }

    // Métodos para insertar libros en listas específicas
    private static void insertarLibroAcademico(List<LibroAcademico> lista, String codigo, String titulo, String autor, double precio) {
        LibroAcademico nuevoLibro = new LibroAcademico(codigo, titulo, autor, precio,"QUIMICA");
        lista.add(nuevoLibro);
    }

    private static void insertarNovela(List<Novela> lista, String codigo, String titulo, String autor, double precio, TipoNovela tipoNovela) {
        Novela nuevaNovela = new Novela(codigo, titulo, autor, precio, tipoNovela);
        lista.add(nuevaNovela);
    }

    private static void insertarLibroTexto(List<LibroTexto> lista, String codigo, String titulo, String autor, double precio, Escuela escuela) {
        LibroTexto nuevoLibroTexto = new LibroTexto(codigo, titulo, autor, precio, escuela);
        lista.add(nuevoLibroTexto);
    }
}




