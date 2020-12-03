package loops;

import java.util.Scanner;

public class EjBucles15 {
    //Este programa pedira 2 numeros por pantalla el primero sera la base y el segundo el exponente y dara el resustado de las potencias hasta llegar al segundo
    public static void main(String[] args) {
        Scanner pow = new Scanner(System.in);
        //Declaramos variables
        System.out.print("Introduzca base: ");
        int base = pow.nextInt(), potencia=1;

        System.out.print("Introduzca exponente: ");
        int exp = pow.nextInt();

        for (int i = 0; i <= exp; i++) {
            if (i==0){
                System.out.println(1);
            }else{
                    potencia = potencia * 2;
                    System.out.println(potencia);
                }
        }
    }
}
