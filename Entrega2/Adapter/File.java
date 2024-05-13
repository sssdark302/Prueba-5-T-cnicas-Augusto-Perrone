package Entrega2.Adapter;

public class File {
    private String filename;

    public File(String filename) {
        this.filename = filename;
    }

    public void read() {
        System.out.println("Reading file: " + filename);
    }
}
