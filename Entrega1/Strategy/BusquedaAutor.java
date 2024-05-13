package Entrega1.Strategy;

import Entrega1.Factory.Medio;

import java.util.List;
import java.util.stream.Collectors;

public class BusquedaAutor
        extends Biblioteca{

    Medio medio;
    public List<Medio> busquedaAutor(String autor) {
        return medios.stream()
                .filter(medio -> medio.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }


}
