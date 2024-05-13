package Entrega1.Strategy;

import java.util.List;
import java.util.stream.Collectors;

public class BusquedaNumPaginas {


    public List<Biblioteca> busquedaNumPaginas(int numPaginas) {
        return bibliotecas.stream()
                .filter(medio -> medio.getNumPaginas() == numPaginas)
                .collect(Collectors.toList());
    }

}
