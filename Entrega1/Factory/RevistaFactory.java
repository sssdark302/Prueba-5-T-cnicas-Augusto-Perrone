package Entrega1.Factory;

import java.time.LocalDate;

public class RevistaFactory
        extends Medio{

    public RevistaFactory(String titulo, int paginas, String genero, String autor, String fechaPublicacion){
        super(titulo, paginas, genero, autor, fechaPublicacion);
    }

    public void createMedio(){
        System.out.println("Revista creada.");
    }
}
