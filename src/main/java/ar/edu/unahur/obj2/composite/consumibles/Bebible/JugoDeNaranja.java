package main.java.ar.edu.unahur.obj2.composite.consumibles.Bebible;

import main.java.ar.edu.unahur.obj2.Bebible.Bebible;

public class JugoDeNaranja extends Bebible {

    public JugoDeNaranja(String nombe, Double precioBase, Integer capacidadML) {
        super(nombe, precioBase, capacidadML);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Double doCosto() {
        // TODO Auto-generated method stub
        return 200.0;
    }

}
