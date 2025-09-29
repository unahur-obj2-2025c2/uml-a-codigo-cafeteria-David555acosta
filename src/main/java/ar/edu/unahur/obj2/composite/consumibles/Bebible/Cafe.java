package main.java.ar.edu.unahur.obj2.composite.consumibles.Bebible;

import main.java.ar.edu.unahur.obj2.Bebible.Bebible;

public class Cafe extends Bebible {
    private Boolean conLeche;

    public Cafe(String nombe, Double precioBase, Integer capacidadML, Boolean conLeche) {
        super(nombe, precioBase, capacidadML);
        this.conLeche = conLeche;
    }

    @Override
    protected Double doCosto() {
        return (this.conLeche) ? 100.0 : 50.0;
    }

}
