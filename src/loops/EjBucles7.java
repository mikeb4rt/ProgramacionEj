package loops;

import java.util.Scanner;

public class EjBucles7 {
    //Este programa simulara una caja fuerte con 4 digitos y dara 4 intentos para adivinarla
    public static void main(String[] args) {
        Scanner contrasenya = new Scanner(System.in);
        //Declaramos variables 4 para los digitos y para los que introduzca el usuario y otra para los intentos
        int correcto1 = 1, correcto2 = 2, correcto3 = 3, correcto4 = 4, digito1, digito2, digito3, digito4, intentos = 4;
        boolean correcta = false;
        do {
            //Le pedimos al usuario que inserte los digitos de la contraseña
            System.out.print("Inserte el primer digito: ");
            digito1 = contrasenya.nextInt();

            //Le pedimos al usuario que inserte los digitos de la contraseña
            System.out.print("Inserte el segundo digito: ");
            digito2 = contrasenya.nextInt();

            //Le pedimos al usuario que inserte los digitos de la contraseña
            System.out.print("Inserte el tercer digito: ");
            digito3 = contrasenya.nextInt();

            //Le pedimos al usuario que inserte los digitos de la contraseña
            System.out.print("Inserte el cuarto digito: ");
            digito4 = contrasenya.nextInt();

            if (digito1 == correcto1 && digito2 == correcto2 && digito3 == correcto3 && correcto4 == digito4) {
                System.out.println("Combinacion correcta");
                correcta = true;
            } else {
                intentos--;
                System.out.println("Combiancion incorrecta intentos restantes: " + intentos);
            }
        } while (intentos > 0 && !correcta);
    }
}
