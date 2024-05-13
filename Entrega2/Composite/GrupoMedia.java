package Entrega2.Composite;

import Entrega1.Factory.Medio;
import Entrega2.Adapter.MedioD;

import java.util.ArrayList;
import java.util.List;

public class GrupoMedia implements MedioD{
    private List<MedioD> mediaList = new ArrayList<>();

    public void add(MedioD media) {
        mediaList.add(media);
    }

    @Override
    public void displayInfo() {
        for (MedioD media : mediaList) {
            media.displayInfo();
        }
    }
}
