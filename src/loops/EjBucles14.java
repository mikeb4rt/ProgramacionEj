package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjBucles14 {
//Este programa pedira dos nombres el primero sera la base de la potencia y el segundo el exponente

    public static void main(String[] args) {
        Scanner pow = new Scanner(System.in);

        //Declaramos variables y imprimimos por pantalla la pregunta y comprobamos que sean aptos para variables int
        try {
            System.out.print("Introduzca la base de la potencia: ");
            double base = pow.nextDouble();
            System.out.println("Introduzca el exponente de la potencia: ");
            double exp = pow.nextDouble();

            if (base < 0 || exp < 0){
                //Mensaje error
                System.out.println("Introduzca un numero positivo");
            } else {
                System.out.println(Math.pow(base,exp));
            }
        }

        catch (InputMismatchException e){
            //Mensaje de error
            System.out.println("Introduzca un numero positivo");
        }
    }
}
