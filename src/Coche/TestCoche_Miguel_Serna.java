package Coche;

public class TestCoche_Miguel_Serna {
    public static void main(String[] args) {
        Coche_Miguel_Serna coche1 = new Coche_Miguel_Serna("Toyota", "Yaris", TipusCanvi.CanviManual, EstadoMotorCoche.Parado);

        //Imprimimos por pantalla los datos del coche
        System.out.println(coche1.getCoche());

        //Sacamos las revoluciones del coche con el estado inicial el cual es parado y devolvera 0
        System.out.println("Revoluciones del coche " + coche1.getRevolutions());

        /*Llamamos al metodo parar motor el cual debe estar dentro de un try ya que puede soltar Exceptions
        el cual soltara el exception ya que esta parado*/
        try {
            System.out.println(coche1.comprobarmotor());
            coche1.pararMotor();
            System.out.println(coche1.comprobarmotor());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*Llamamos al metodo parar motor el cual debe estar dentro de un try ya que puede soltar Exceptions
        el cual cambiara el estado del motor*/
        try {
            System.out.println(coche1.comprobarmotor());
            coche1.arrancarMotor();
            System.out.println(coche1.comprobarmotor());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Comprobamos las revoluciones con el coche en marcha
        System.out.println("Revoluciones del coche " + coche1.getRevolutions());;

        /*Llamamos al metodo parar motor el cual debe estar dentro de un try ya que puede soltar Exceptions
        el cual soltara el exception ya que esta en marcha*/
        try {
            coche1.comprobarmotor();
            coche1.arrancarMotor();
            coche1.comprobarmotor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
