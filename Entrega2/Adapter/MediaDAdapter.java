package Entrega2.Adapter;

public class MediaDAdapter
implements MedioD{
    private File file;

    public MediaDAdapter(File file) {
        this.file = file;
    }

    @Override
    public void displayInfo() {
        file.read();
    }
}
