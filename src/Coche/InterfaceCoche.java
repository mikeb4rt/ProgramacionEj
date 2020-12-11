package Coche;

public interface InterfaceCoche {
    public void arrancarMotor() throws Exception;
    public EstadoMotorCoche comprobarmotor();
    public int getRevolutions();
    public void pararMotor() throws Exception;
}