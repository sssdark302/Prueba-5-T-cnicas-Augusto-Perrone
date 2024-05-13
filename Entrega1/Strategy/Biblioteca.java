package Entrega1.Strategy;

import Entrega1.Factory.LibroFactory;
import Entrega1.Factory.Medio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca
     implements Busqueda{
    List<Medio> medios;

    public Biblioteca() {
        this.medios = new ArrayList<>();
    }

    public void addMedio(Medio medio) {
        this.medios.add(medio);
    }

    public List<Medio> getMedios() {
        return medios;
    }
    @Override
    public void buscar() {
        System.out.println("Buscando en la biblioteca...");
    }

}
