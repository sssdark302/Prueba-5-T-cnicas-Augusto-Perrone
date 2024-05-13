package Entrega1.Strategy;

import java.util.List;
import java.util.stream.Collectors;

public class BusquedaGenero {
    public List<Biblioteca> busquedaGenero(String genero) {
        return bibliotecas.stream()
                .filter(medio -> medio.getGenero().equalsIgnoreCase(genero))
                .collect(Collectors.toList());
    }

}
