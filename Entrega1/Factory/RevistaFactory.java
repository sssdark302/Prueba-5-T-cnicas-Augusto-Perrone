package Entrega1.Factory;

import java.time.LocalDate;

public class RevistaFactory
        extends Medio{

    LocalDate fechaPublicacion;


    public RevistaFactory(String titulo, int paginas, LocalDate fechaPublicacion) {
        super(titulo, paginas);
        this.fechaPublicacion= fechaPublicacion;
    }
}
