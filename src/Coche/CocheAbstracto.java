package Coche;

public abstract class CocheAbstracto {
    protected String marca;
    protected String model;
    protected TipusCanvi tipuscanvi;

    public CocheAbstracto(String marca, String model, TipusCanvi tipuscanvi) {
        this.marca = marca;
        this.model = model;
        this.tipuscanvi = tipuscanvi;
    }

    //Getters
    public String getMarca(){
        return this.marca;
    }

    public String getModel(){
        return this.model;
    }

    public TipusCanvi getTipuscanvi(){
        return this.tipuscanvi;
    }
}
