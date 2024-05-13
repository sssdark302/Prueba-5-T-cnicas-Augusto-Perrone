package Entrega1.Factory;

import java.time.LocalDate;

public class DiarioFactory
        extends Medio{

    LocalDate fechaPublicacion;


    public DiarioFactory(String titulo, int paginas, LocalDate fechaPublicacion, String genero, String autor) {
        super(titulo, paginas, genero, autor);
        this.fechaPublicacion = fechaPublicacion;
    }
}
