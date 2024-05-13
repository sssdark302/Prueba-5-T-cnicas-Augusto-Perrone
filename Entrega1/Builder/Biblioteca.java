package Entrega1.Builder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Biblioteca {

    private Map<String, String> autoresLibros = new HashMap<>();
    private Map<String, String> autoresRevistas = new HashMap<>();
    private Map<String, String> autoresDiario = new HashMap<>();

    public void buscarAutor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del autor a buscar:");
        String input = scanner.nextLine();
            String regex = ".*" + Pattern.quote(input) + ".*";

        System.out.println("Resultados de la búsqueda:");
        buscarAutoresEnMap(autoresLibros, regex, "Autores Libros");
        buscarAutoresEnMap(autoresRevistas, regex, "Autores Revistas");
        buscarAutoresEnMap(autoresDiario, regex, "Autores Diario");
    }
    private void buscarAutoresEnMap(Map<String, String> map, String regex, String mapName) {
        boolean encontrado = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (Pattern.matches(regex, entry.getValue())) {
                System.out.println(mapName + " - Título: " + entry.getKey() + ", Autor: " + entry.getValue());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron autores en " + mapName + " que coincidan con la búsqueda.");
        }
    }
}
