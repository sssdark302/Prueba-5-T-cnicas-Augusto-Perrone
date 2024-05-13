package Entrega1.Strategy;

import Entrega1.Factory.Medio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BusquedaAutor {
    private List<Biblioteca> bibliotecas = new ArrayList<>();
    Medio medio;
    public List<Biblioteca> busquedaAutor(String autor) {
        return bibliotecas.stream()
                .filter(medio -> medio.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }


}
