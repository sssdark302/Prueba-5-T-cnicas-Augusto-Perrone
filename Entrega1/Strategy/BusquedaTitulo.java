package Entrega1.Strategy;

import Entrega1.Factory.Medio;

import java.util.List;
import java.util.stream.Collectors;

public class BusquedaTitulo
        extends Biblioteca{

    public List<Medio> busquedaTitulo(String titulo) {
        return medios.stream()
                .filter(medio -> medio.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());
    }
}
