package Entrega2.Adapter;

public class Libro
        implements MedioD {
    private String title;

    public Libro(String title) {
        this.title = title;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title);
    }
}
