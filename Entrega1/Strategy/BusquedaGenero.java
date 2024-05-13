package Entrega1.Strategy;

import Entrega1.Factory.Medio;

import java.util.List;
import java.util.stream.Collectors;

public class BusquedaGenero
        extends Biblioteca {
    public List<Medio> busquedaGenero(String genero) {
        return medios.stream()
                .filter(medio -> medio.getGenero().equalsIgnoreCase(genero))
                .collect(Collectors.toList());
    }

}
