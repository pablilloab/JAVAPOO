package apoo01;

import entity.Libro;
import service.LibroService;

public class EntryPoint {
    public static void main(String[] args) {
        Libro miLibro = LibroService.cargarLibro();

        System.out.println(miLibro);
    }
}
