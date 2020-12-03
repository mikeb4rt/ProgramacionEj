package loops;

import java.util.Scanner;
public class EjBucles9 {
    //Este programa contara las letras de una palabra introducida por teclado
    public static void main(String[] args) {
        //Introducimos una variable que le pide al usuario que introduzca un numero
        Scanner insetint = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero= insetint.nextInt();

        //Pasamos el numero a variable tipo string para poder usar metodos de string y la imprimimos por pantalla
        System.out.println("El numero "+numero+" tiene "+Integer.toString(numero).length()+" digitos");
    }
}
