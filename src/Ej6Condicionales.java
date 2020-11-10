import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ej6Condicionales {
    public static void main(String[] args) {
        //Este programam calculara el tiempo que tarda un objeto en caer desde una altura dada por el usuario
        Scanner datos = new Scanner(System.in);
        final double G=9.81;
        //Pedimos al usuario que nos introduzca la altura
        System.out.print("Introduzca altura");
        int h = datos.nextInt(),t;
        System.out.println("El objeto tarda en caer: "+Math.sqrt((2*h)/G));
    }
}
