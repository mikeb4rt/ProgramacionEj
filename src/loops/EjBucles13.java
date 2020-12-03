package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjBucles13 {
    //Este programa pedira 10 numeros por pantalla y dira si son positivos o negativos
    public static void main(String[] args) {

        Scanner nums = new Scanner(System.in);
        //Declaramos variables
        int positivos = 0, negativos = 0, entrada;
        boolean miss = false;

        //Hacemos un bucle para que el usuario nos introduzca los 10 numeros y decir cuantos de ellos son positivos y cuantos negativos
        while (positivos + negativos < 10 && !miss) try {
            System.out.print("Introduzca un numero: ");
            entrada = nums.nextInt();

            if (entrada < 0) {
                negativos++;
            } else {
                positivos++;
            }
        } catch (InputMismatchException e) {
            //Mensaje de error
            System.out.println("Introduzca un caracter numerico");
            nums.next();
            miss = true;
        }
        System.out.println("Hay " + positivos + " numeros positivos");
        System.out.println("Hay " + negativos + " numeros negativos");
    }
}
