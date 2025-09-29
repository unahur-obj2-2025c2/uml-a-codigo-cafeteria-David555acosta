package main.java.ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

import main.java.ar.edu.unahur.obj2.composite.consumibles.Consumible;

public class Combo implements Consumible {
    private String nombre;
    private Integer precio;
    private List<Consumible> consumibles = new ArrayList<>();

    public Combo(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Combo(String nombre, Integer precio, List<Consumible> consumibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumibles = consumibles;
    }

    public void Agregar(Consumible consumible) {
        consumibles.add(consumible);
    }

    public void eliminar(Consumible consumible) {
        consumibles.remove(consumible);
    }

    @Override
    public Double costo() {
        return Double.min(precio, productos.stream().mapToDouble(Consumible::costo).sum());
    }

}
