package Entrega1.Factory;

import java.time.LocalDate;

public class LibroFactory
        extends Medio{


    public LibroFactory(String titulo, int paginas, String genero, String autor, String fechaPublicacion) {
        super(titulo, paginas, genero, autor, fechaPublicacion);
    }

    public void createMedio(){
        System.out.println("Libro creado.");
    }
}
