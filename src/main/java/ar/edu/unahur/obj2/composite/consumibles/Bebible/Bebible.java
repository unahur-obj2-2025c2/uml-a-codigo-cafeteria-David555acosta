package main.java.ar.edu.unahur.obj2.Bebible;

import main.java.ar.edu.unahur.obj2.composite.consumibles.Producto;

public abstract class Bebible extends Producto {

    protected Integer capacidadML;

    public Bebible(String nombe, Double precioBase, Integer capacidadML) {
        super(nombe, precioBase);
        this.capacidadML = capacidadML;
        // TODO Auto-generated constructor stub
    }

    @Override
    public Double costo() {
        // TODO Auto-generated method stub
        return precioBase + doCosto();
    }

    protected abstract Double doCosto();

}
