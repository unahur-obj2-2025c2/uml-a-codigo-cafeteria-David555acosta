package ar.edu.unahur.obj2.composite.consumibles.Comestible;

public class Tostado extends Comestible {
    private TipoTostado tipoTostado;

    public Tostado(String nombe, Double precioBase, Integer pesoEnGramos, TipoTostado tipoTostado) {
        super(nombe, precioBase, pesoEnGramos);
        this.tipoTostado = tipoTostado;
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Double doCosto() {
        // TODO Auto-generated method stub
        return switch (this.tipoTostado.name()) {
            case "Salame_y_Queso" -> 150.0;
            default -> 100.0; // aleman le gustan todas al igual que cualquier otro
        };
    }

}
