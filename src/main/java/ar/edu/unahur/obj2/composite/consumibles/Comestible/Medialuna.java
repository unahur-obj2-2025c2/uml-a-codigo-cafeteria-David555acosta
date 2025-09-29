package main.java.ar.edu.unahur.obj2.composite.consumibles.Comestible;

public class Medialuna extends Comestible {

    private TipoMedialuna tipoMedialuna;

    public Medialuna(String nombe, Double precioBase, Integer pesoEnGramos, TipoMedialuna tipoMedialuna) {
        super(nombe, precioBase, pesoEnGramos);
        this.tipoMedialuna = tipoMedialuna;
        // TODO Auto-generated constructor stub
    }

    @Override
    public Double doCosto() {
        return switch (this.tipoMedialuna.name()) {
            case "De_Manteca" -> 100.0;
            case "De_DulceDeLecha" -> 50.0;
            default -> 100.0; // aleman le gustan todas al igual que cualquier otro
        };
    }

}
