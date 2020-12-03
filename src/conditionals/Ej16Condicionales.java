package conditionals;

import java.util.Scanner;

public class Ej16Condicionales {
    //Este programa recibira un numero de 5 cifras maximo y devolvera la primera
    public static void main(String[] args) {
        System.out.print("Introduzca un numero de 5 cifras como maximo");
        Scanner con1=new Scanner(System.in);
        double cifra;

        int num=con1.nextInt();

        if (Integer.toString(num).length()<6){
            cifra=num/Math.pow(10,Integer.toString(num).length()-1);
            System.out.println("La primera cifra es: "+(int)cifra);
        }else{
            System.out.println("Numero mayor de 5 cifras");
        }

    }
}
