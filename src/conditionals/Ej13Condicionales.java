package conditionals;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13Condicionales {
    public static void main(String[] args) {
        //Declaramos variables
        Scanner orden = new Scanner(System.in);

        //Los numeros que introducira el usuario estaran en un array para automatizar el proceso
        int numbers[];
        numbers = new int[3];

        //Hacemos un bucle for para añadir los numeros que introducira el usuario al array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduzca 1 numero");
            numbers[i] = orden.nextInt();
        }
        /*Arrays.sort(numbers);
        System.out.println("Numeros ordenados usando sort: " + Arrays.toString(numbers));*/
        //Comparamos los numeros y los imprimimos por pantalla usando if
        if (numbers[0] > numbers[1] && numbers[1] > numbers[2]) {
            System.out.println("Los numeros de mayor a menor son usando if: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);

        } else if (numbers[0] > numbers[1] && numbers[1] < numbers[2]) {
            System.out.println("Los numeros de mayor a menor son usando if: " + numbers[0] + " " + numbers[2] + " " + numbers[1]);

        } else if (numbers[1] > numbers[0] && numbers[0] > numbers[2]) {
            System.out.println("Los numeros de mayor a menor son usando if: " + numbers[1] + " " + numbers[0] + " " + numbers[2]);

        } else if (numbers[1] > numbers[0] && numbers[0] < numbers[2]) {
            System.out.println("Los numeros de mayor a menor son usando if: " + numbers[1] + " " + numbers[2] + " " + numbers[0]);

        } else if (numbers[2] > numbers[1] && numbers[1] < numbers[0]) {
            System.out.println("Los numeros de mayor a menor son usando if: " + numbers[2] + " " + numbers[0] + " " + numbers[1]);

        } else if (numbers[2]>numbers[1] && numbers[1]>numbers[0])
            System.out.println("Los numeros de mayor a menor son usando if: " + numbers[2] + " " + numbers[1] + " " + numbers[0]);
        }
    }

