package Coche;

public abstract class CocheAbstracto implements InterfaceCoche {
    protected String marca;
    protected String model;
    protected TipusCanvi tipuscanvi;

    public CocheAbstracto(String marca, String model, TipusCanvi tipuscanvi) {
        this.marca = marca;
        this.model = model;
        this.tipuscanvi = tipuscanvi;
    }
}