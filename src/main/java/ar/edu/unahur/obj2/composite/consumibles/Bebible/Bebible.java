package ar.edu.unahur.obj2.composite.consumibles.Bebible;

public abstract class Bebible extends ar.edu.unahur.obj2.composite.consumibles.Producto {

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
