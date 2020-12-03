package conditionals;

import java.util.Scanner;

public class Ej15Condicionales {
    //Este programa recibira un numero por teclado y devolvera su ultima cifra
    public static void main(String[] args) {
        Scanner UserInt= new Scanner(System.in);

        int num=UserInt.nextInt();

        System.out.println("La ultima cifra es: "+ num%10);
    }
}
