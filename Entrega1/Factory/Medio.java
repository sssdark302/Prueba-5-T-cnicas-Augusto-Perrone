package Entrega1.Factory;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Medio {
    protected String titulo, genero, autor,fechaPublicacion;
    protected int paginas;

    public Medio(String titulo, int paginas, String genero, String autor, String fechaPublicacion) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void createMedio(){
        System.out.println("Medio creado.");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    //cambiarlo para que sea mas bonito
    @Override
    public String toString() {
        return "Medio: [" +
                "Titulo:'" + titulo + '\'' +
                ", Genero:'" + genero + '\'' +
                ", Autor:'" + autor + '\'' +
                ", Paginas:" + paginas +
                ", Fecha de Publicacion: '" + fechaPublicacion + '\'' +
                ']';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de medio (Libro, Revista, Diario):");
        String tipo = scanner.nextLine();

        System.out.println("Ingrese el título:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el número de páginas:");
        int paginas = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el género:");
        String genero = scanner.nextLine();

        System.out.println("Ingrese el autor:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese la fecha de publicación:");
        String fechaPublicacion = scanner.nextLine();

        Medio medio = null;

        switch (tipo.toLowerCase()) {
            case "libro":
                medio = new LibroFactory(titulo, paginas, genero, autor, fechaPublicacion);
                break;
            case "revista":
                medio = new RevistaFactory(titulo, paginas, genero, autor, fechaPublicacion);
                break;
            case "diario":
                medio = new DiarioFactory(titulo, paginas, genero, autor, fechaPublicacion);
                break;
            default:
                System.out.println("Tipo de medio desconocido. Intente de nuevo.");
                return;
        }

        medio.createMedio();
        System.out.println(medio.toString());
    }
}
