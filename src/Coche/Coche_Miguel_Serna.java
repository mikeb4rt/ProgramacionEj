package Coche;

public class Coche_Miguel_Serna extends CocheAbstracto implements InterfaceCoche {

    protected EstadoMotorCoche estadocoche;

    //Constructor
    public Coche_Miguel_Serna(String marca, String model, TipusCanvi tipuscanvi, EstadoMotorCoche estadocoche) {
        super(marca, model, tipuscanvi);
        this.estadocoche = estadocoche;
    }

    //Getters
    public String getCoche() {
        return "Marca del coche: " + this.marca + " modelo del coche: " + this.model + " tipo de cambio: " + this.tipuscanvi + " el coche esta: " + this.estadocoche;
    }

    @Override
    public void arrancarMotor() throws Exception {
        if (this.comprobarmotor() == EstadoMotorCoche.Parado) {
            this.estadocoche = EstadoMotorCoche.EnMarcha;
        } else throw new Exception("El coche ya estaba en marcha");
    }

    @Override
    public EstadoMotorCoche comprobarmotor() {
        return this.estadocoche;
    }

    @Override
    public int getRevolutions() {
        if (this.comprobarmotor() == EstadoMotorCoche.EnMarcha) {
            return (int) (Math.random() * 6500) + 1;
        } else return 0;
    }

    @Override
    public void pararMotor() throws Exception {
        if (this.comprobarmotor() == EstadoMotorCoche.EnMarcha) {
            this.estadocoche = EstadoMotorCoche.Parado;
        } else throw new Exception("El coche ya estaba parado");
    }
}