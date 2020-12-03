package loops;

import java.sql.Date;
import java.util.Scanner;

public class EjBucles10 {
    //Este programa calcula la media de unos numeros introducidos por teclado hasta que se introduzca uno nengativo
    public static void main(String[] args) {
        Scanner numMedia = new Scanner(System.in);
        int nums, contador = 1, total = 0;
        int media = 0;

        do {
            System.out.print("Introduzca un numero: ");
            nums = numMedia.nextInt();
            if (nums >= 0) {
                total = total + nums;

                media = total / contador;
                System.out.println(total);
                contador++;
            } else {
                System.out.println("Media: " + media);
            }

        } while (nums >= 0);


    }
}
