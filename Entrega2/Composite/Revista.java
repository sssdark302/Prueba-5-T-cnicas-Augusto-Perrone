package Entrega2.Composite;

import Entrega2.Adapter.MedioD;

public class Revista implements MedioD{
    private String title;

    public Revista(String title) {
        this.title = title;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a magazine: " + title);
    }
}
