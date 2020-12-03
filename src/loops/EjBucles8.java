package loops;

import java.util.Scanner;

public class EjBucles8 {
    public static void main(String[] args) {
        //Este programa ralizara la tabla de un numero dado por el usuario
        int num1, multiplicador;
        boolean correct = false;
        Scanner numero = new Scanner(System.in);
        do {
            //Le pedimos al usuario que introduzca un numero
            System.out.print("Introduzca el numero para hacer la tabla: ");
            num1 = numero.nextInt();

            if (num1 >= 0 && num1 <= 9) {
                for (multiplicador = 0; multiplicador <= 10; multiplicador++) {
                    System.out.println(num1 * multiplicador);
                }
                correct = true;
            } else {
                System.out.println("Numero no esta entre 0-9 o no es un numero");
            }
        }while (!correct);
    }
}
