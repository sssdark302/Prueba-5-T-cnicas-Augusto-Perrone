package Entrega1.Strategy;

import java.util.List;
import java.util.stream.Collectors;

public class BusquedaTitulo {

    public List<Biblioteca> busquedaTitulo(String titulo) {
        return bibliotecas.stream()
                .filter(medio -> medio.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());
    }
}
