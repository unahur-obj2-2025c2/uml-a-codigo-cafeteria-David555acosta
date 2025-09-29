package ar.edu.unahur.obj2.composite.consumibles.Comestible;

import ar.edu.unahur.obj2.composite.consumibles.Producto;

public abstract class Comestible extends Producto {
    protected Integer pesoEnGramos;

    public Comestible(String nombe, Double precioBase, Integer pesoEnGramos) {
        super(nombe, precioBase);
        this.pesoEnGramos = pesoEnGramos;
        // TODO Auto-generated constructor stub
    }

    public Integer getPesoEnGramos() {
        return pesoEnGramos;
    }

    @Override
    public Double costo() {
        return this.pesoEnGramos + doCosto();
    }

    protected abstract Double doCosto();

}
