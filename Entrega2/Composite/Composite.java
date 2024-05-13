package Entrega2.Composite;

import Entrega2.Adapter.Libro;
import Entrega2.Adapter.MedioD;

public class Composite {
    MedioD book1 = new Libro("Book 1");
    MedioD book2 = new Libro("Book 2");
    MedioD magazine1 = new Revista("Magazine 1");

    GrupoMedia collection = new GrupoMedia();
        collection.add(book1);
        collection.add(book2);
        collection.add(magazine1);
        collection.displayInfo();
}
