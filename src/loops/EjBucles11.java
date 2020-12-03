package loops;

import java.util.Arrays;
import java.util.Scanner;

public class EjBucles11 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        double[] UserNumbers, cuadrados, cubos;
        cuadrados = new double[5];
        cubos = new double[5];
        UserNumbers = new double[5];

        for (int i = 0; i < UserNumbers.length; i++) {
            UserNumbers[i] = numbers.nextFloat();
            cuadrados[i] = Math.pow(UserNumbers[i], 2);
            cubos[i] = Math.pow(UserNumbers[i], 3);
        }
        for (int i = 0; i < UserNumbers.length; i++) {
            double Usernumber=UserNumbers[i];
            double cuadrado=cuadrados[i];
            double cubo=cubos[i];
            System.out.printf("%5.0f %5.0f %5.0f%n",Usernumber,cuadrado,cubo);
        }
    }
}
