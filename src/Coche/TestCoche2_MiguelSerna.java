package Coche;

public class TestCoche2_MiguelSerna {

    public static void main(String[] args) {

        CotxeSegonaPart_Miguel_Serna coche1 = new CotxeSegonaPart_Miguel_Serna("Toyota", "Yaris", TipusCanvi.CanviAutomatic, EstadoMotorCoche.EnMarcha, Marcha.N);
        try {
            System.out.println(coche1.getRevolutions());
            System.out.println(coche1.getmarcha());
            coche1.CanviarMarchaAutomatica('-');
            System.out.println(coche1.getmarcha());
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
