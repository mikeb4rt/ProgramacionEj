package conditionals;

import java.util.Scanner;

public class Ej14Condicionales {
    //Este programa pedira un numero al usuario y dira si es par o divisible entre 5
    public static void main(String[] args) {
        Scanner UsInts= new Scanner(System.in);

        //Declaramos variables
        System.out.println("Introduzca un numero");
        int cifra=UsInts.nextInt();

        //Hacemos la comprobacion
        if (cifra%2==0 && cifra%5==0){
            System.out.println("El numero es par y divisible entre 5");
        }else if (cifra%5==0){
            System.out.println("El numero es divisible entre 5");
        }else if (cifra%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero no es par ni divisible entre 5");
        }
    }
}
