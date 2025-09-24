package ar.edu.unahur.obj2.composite.consumibles;

public class Comestible extends Producto {
    protected Integer pesoGramos;

    public Comestible(String nombre, Double precioBase, Integer pesoGramos) {
        super(nombre, precioBase);
        this.pesoGramos = pesoGramos;
        // TODO Auto-generated constructor stub
    }

    @Override
    public Double costo() {
        // TODO Auto-generated method stub
        return super.costo();
    }

}
