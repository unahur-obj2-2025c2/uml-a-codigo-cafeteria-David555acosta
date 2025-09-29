package ar.edu.unahur.obj2.composite.consumibles;

import java.util.ArrayList;
import java.util.List;

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

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public List<Consumible> getConsumibles() {
        return consumibles;
    }

    public void Agregar(Consumible consumible) {
        consumibles.add(consumible);
    }

    public void eliminar(Consumible consumible) {
        consumibles.remove(consumible);
    }

    @Override
    public Double costo() {
        return consumibles.stream().mapToDouble(c -> c.costo()).sum();
    }

}
