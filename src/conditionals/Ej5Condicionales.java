package conditionals;

import java.util.Scanner;

public class Ej5Condicionales {
    //Este programa calculara una equacion de 2 grado (aX+b=0)
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        //Declaramos variables
        int num1,num2,incognita;

        //Pedimos al usuario un valor para A
        System.out.print("Escriva un valor para A: ");
        num1 = nums.nextInt();

        //Pedimos al usuario un valor para B
        System.out.print("Escriva un valor para B: ");
        num2 = nums.nextInt();

        //Calculamos el valor de X
        incognita = -num2 / num1;

        //Imprimimos por pantalla el valor de X
        System.out.println("El valor de X es: " + incognita);
    }
}
