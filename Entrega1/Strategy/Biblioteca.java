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

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el titulo del medio que desea buscar: ");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del medio que desea buscar: ");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el genero del medio que desea buscar: ");
        String genero = scanner.nextLine();
        System.out.println("Ingrese el numero de paginas del medio que desea buscar: ");
        int numPaginas = scanner.nextInt();
        BusquedaTitulo busquedaTitulo = new BusquedaTitulo();
        BusquedaAutor busquedaAutor = new BusquedaAutor();
        BusquedaGenero busquedaGenero = new BusquedaGenero();
        BusquedaNumPaginas busquedaNumPaginas = new BusquedaNumPaginas();
    }
}
