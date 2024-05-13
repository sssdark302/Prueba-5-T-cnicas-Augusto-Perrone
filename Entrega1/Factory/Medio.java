package Entrega1.Factory;

public abstract class Medio {


    private String titulo, genero, autor;
    private int paginas;


    public Medio(String titulo, int paginas, String genero, String autor){
        this.titulo = titulo;
        this.paginas = paginas;
        this.genero = genero;
        this.autor = autor;
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
        return "Medio{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
