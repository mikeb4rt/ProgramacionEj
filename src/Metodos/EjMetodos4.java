package Metodos;

import java.util.Scanner;

public class EjMetodos4 {
    public static void main(String[] args) {
        Scanner datosE = new Scanner(System.in);
        System.out.print("Introduce valor para la base: ");
        int b = datosE.nextInt();
        System.out.print("Introduzca valor para el exponente: ");
        int e = datosE.nextInt();
        System.out.println(integerPower(b,e));
    }
    public static int integerPower(int b, int e) {
        int pow = b;
        if (e > 0) {
            for (int i = 1; i < e; i++) {
                pow *= b;
            }
        }
        return pow;
    }
}
