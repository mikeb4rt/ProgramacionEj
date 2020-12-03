package Metodos;

import java.util.Scanner;

public class EjMetodos1 {
    public static void main(String[] args) {
        Parking testJuan = new Parking("Juan", 5, 2);
        Parking testPaco = new Parking("Paco", 1, 2);
        Parking testMario = new Parking("Mario", 17, 2);
        Parking testJudas = new Parking("Judas", 6, 2);
        System.out.println(testJuan.calculateCharges());
        System.out.println(testPaco.calculateCharges());
        System.out.println(testMario.calculateCharges());
        System.out.println(testJudas.calculateCharges());
    }

    public static class Parking {

        public static double collection = 0;
        /*
        Declaramos la variable cargos que almacenara cuanto hay que pagar por el estacionamiento,
        le damos el valor por defecto a 2 consirendo que el cliente estara menos de 3 horas por defecto
        */
        private double cargos=2;
        //Declaramos el resto de variables que almacera las horas y los minutos que ha estado el usuario y otra para el total de tiempo en horas
        private final double horas;
        private final double minutos;
        private final double totalHoras;
        private final String NombreC;

        //Constructor
        public Parking(String nombre, double horas, double minutos){
            this.NombreC = nombre;
            this.horas = horas;
            this.minutos = minutos;
            this.totalHoras = minutos / 60 +horas;
        }

        //Getters
        public String GetNombreTotalHoras(){
            return "Cliente: "+ NombreC + "Ha estado: " + totalHoras;
        }

        //Este metodo calculara cuanto hay que pagar en un parking y recibira por entrada las horas que se ha estado aparcado
        public String calculateCharges() {
            //En el caso de estar mas de 3 horas y menos de 24 el usuario paga 0.5€ por hora o parte de ella extra a los 2 por defecto
            if (this.totalHoras > 3 && this.totalHoras < 24) {
                for (double i = this.totalHoras; i >= 3; i--) {
                    this.cargos += 0.5;
                }
                //Si esta 24 horas paga 10€ no se contempla que este mas de 24 horas
            } else if (this.totalHoras>= 14) {
                this.cargos = 10;
            }
            collection=collection+cargos;
            //Devolvemos la variable cargos
            return "El cliente " + this.NombreC + " ha estado " + (int)this.horas + ":" + (int)this.minutos + " se le cobra " + this.cargos + "€" + " total recolectado " + collection + "€";
        }
    }
}
