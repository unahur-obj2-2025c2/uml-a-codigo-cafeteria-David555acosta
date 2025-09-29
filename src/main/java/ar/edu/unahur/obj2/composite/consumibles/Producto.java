package main.java.ar.edu.unahur.obj2.composite.consumibles;

public abstract class Producto implements Consumible {

    protected String nombe;
    protected Double precioBase;

    public Producto(String nombe, Double precioBase) {
        this.nombe = nombe;
        this.precioBase = precioBase;
    }

    @Override
    public Double costo() {
        // TODO Auto-generated method stub
        return this.precioBase;
    }

}
