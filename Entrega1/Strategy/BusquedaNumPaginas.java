package Entrega1.Strategy;

import Entrega1.Factory.Medio;

import java.util.List;
import java.util.stream.Collectors;

public class BusquedaNumPaginas
        extends Biblioteca {


    public List<Medio> busquedaNumPaginas(int numPaginas) {
        return medios.stream()
                .filter(medio -> medio.getPaginas() == numPaginas)
                .collect(Collectors.toList());
    }

}
