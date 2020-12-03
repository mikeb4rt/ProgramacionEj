package loops;

import java.util.Scanner;

public class EjBucles16 {
    //Este programa pedira un numero por pantalla y dira si es primo
    public static void main(String[] args) {


        Scanner primo = new Scanner(System.in);

        //Declaramos variables
        System.out.print("Introduzca un numero: ");
        int num = primo.nextInt(), divisores=0;

        //Hacemos un bucle que dividira el numero desde 1 hasta el numero dado y si el modulo es 0 aumentara la variable divisores
        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                divisores++;
            }
        }

        //Hacemos una condicion que estipula que si divisores=2 el numero es primo si no, no lo es
        if (divisores==2){
            System.out.println("El numero es primo");
        }else {
            System.out.println("El numero no es primo");
        }
    }
}
