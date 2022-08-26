package service;

import entity.Libro;

import java.util.Scanner;

public class LibroService {

    public static Scanner read = new Scanner(System.in);

    public static Libro cargarLibro(){
        System.out.println("Ingrese el ISBN");
        int isbn = read.nextInt();
        read.nextLine();
        System.out.println("Ingrese el Titulo");
        String titulo = read.nextLine();
        System.out.println("Ingrese el autor");
        String autor = read.nextLine();
        System.out.println("Ingrese cantidad de Paginas");
        int cantidadPaginas = read.nextInt();

        return new Libro(isbn, titulo, autor, cantidadPaginas);

    }


}
