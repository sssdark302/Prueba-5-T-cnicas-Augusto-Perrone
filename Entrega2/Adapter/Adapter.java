package Entrega2.Adapter;

public class Adapter {
    public static void main(String[] args) {
        File file = new File("book.txt");
        MedioD book = new MediaDAdapter(file);
        book.displayInfo();
    }
}
