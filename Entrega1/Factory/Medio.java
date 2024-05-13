package Entrega1.Factory;

public abstract class Medio {


    String titulo;
    int paginas;

    public Medio(String titulo, int paginas){
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public void createMedio(){
        if (this instanceof DiarioFactory){
            System.out.println("Diario creado.");
        } else if (this instanceof RevistaFactory){
            System.out.println("Revista creada.");
        } else if (this instanceof LibroFactory){
            System.out.println("Libro creado.");
        }
    }

    public void buscarAutor(){

    }

}
