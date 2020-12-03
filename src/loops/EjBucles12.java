package loops;

import java.util.Scanner;

public class EjBucles12 {
    //Imprimira por pantalla los n primeros numeros de la sucesion de fibonacci
    public static void main(String[] args) {
        Scanner fibonacci = new Scanner(System.in);

        //Declaramos variables
        System.out.print("Hasto que numero de fibonacci: ");
        int n = fibonacci.nextInt(),num1=1,num2,imprimir=0;

        //Hacemos el bucle para imprimir los n primeros numeros de la sucesion
        for (int i = 0; i < n; i++) {
            if (i==0){
                System.out.println(0);
            }else{
                imprimir=imprimir+num1;
                num2=imprimir-num1;
                num1=num2;
                System.out.println(imprimir);
            }

        }
    }
}
