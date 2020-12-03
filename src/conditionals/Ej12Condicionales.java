package conditionals;

import java.util.Scanner;

public class Ej12Condicionales {
    public static void main(String[] args) {
        //Este programa realizara un cuestionario de 10 preguntas y devolvera una nota
        Scanner respuestas = new Scanner(System.in);
        int respuesta, marks = 0;
        System.out.println("Para contestar a las preguntas introduzca un numero del 1 al 4");

        System.out.println("Pregunta 1");
        System.out.println("1-Respuesta 1.1"); //correcta
        System.out.println("2-Respuesta 1.2");
        System.out.println("3-Respuesta 1.3");
        System.out.println("4-Respuesta 1.4");

        do {
            System.out.println("Su respuesta: ");
            respuesta = respuestas.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("Respuesta correcta");
                    marks++;
                    break;
                case 2:
                    System.out.println("Respuesta incorrecta");
                    break;
                case 3:
                    System.out.println("Respuesta incorrecta");
                    break;
                case 4:
                    System.out.println("Respuesta incorrecta");
                    break;
                default:
                    System.out.println("Numero mayor de 4 o no es un numero, vuelva a contestar");
            }
        } while (respuesta > 4);

        System.out.println("Pregunta 2");
        System.out.println("1-Respuesta 2.2");
        System.out.println("2-Respuesta 2.2");
        System.out.println("3-Respuesta 2.3");//correcta
        System.out.println("4-Respuesta 2.4");

        do {
            System.out.println("Su respuesta: ");
            respuesta = respuestas.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("Respuesta incorrecta");
                    break;
                case 2:
                    System.out.println("Respuesta incorrecta");
                    break;
                case 3:
                    System.out.println("Respuesta correcta");
                    marks++;
                    break;
                case 4:
                    System.out.println("Respuesta incorrecta");
                    break;
                default:
                    System.out.println("Numero mayor de 4 o no es un numero, vuelva a contestar");
            }
        } while (respuesta > 4);

        System.out.println("Pregunta 2");
        System.out.println("1-Respuesta 2.2");
        System.out.println("2-Respuesta 2.2");
        System.out.println("3-Respuesta 2.3");
        System.out.println("4-Respuesta 2.4");//correcta

        do {
            System.out.println("Su respuesta: ");
            respuesta = respuestas.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("Respuesta incorrecta");
                    break;
                case 2:
                    System.out.println("Respuesta incorrecta");
                    break;
                case 3:
                    System.out.println("Respuesta incorrecta");
                    break;
                case 4:
                    System.out.println("Respuesta correcta");
                    marks++;
                    break;
                default:
                    System.out.println("Numero mayor de 4 o no es un numero, vuelva a contestar");
            }
        } while (respuesta > 4);

        //Imprimimos puntuacion
        System.out.println("Su puntuacion en el examen es: " + marks);
    }
}
