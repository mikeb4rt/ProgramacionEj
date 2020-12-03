package Metodos;

import java.util.Scanner;

public class EjMetodos5 {
    public static void main(String[] args) {
        Scanner lados = new Scanner(System.in);
        System.out.print("Introduzca los catetos");
        double d1 = lados.nextDouble();
        double d2 = lados.nextDouble();
        System.out.println(hypotenuse(d1,d2));
        System.out.println(Math.hypot(d1, d2));
    }

    //Calcula la hipotenusa
    public static double hypotenuse(double d1, double d2){
        return Math.sqrt(Math.pow(d1,2) + Math.pow(d2,2));
    }

}
