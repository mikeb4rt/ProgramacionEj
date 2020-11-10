import java.util.Scanner;

public class Ej9Condicionales {
    //Este programa resolvera equaciones de segundo grado
    public static void main(String[] args) {
        Scanner numbers=new Scanner(System.in);

        //Declaramos variables
        //Pedimos valor para A
        System.out.println("Introduzca valor para A");
        int A=numbers.nextInt();

        //Pedimos valor para B
        System.out.println("Introduzca valor para B");
        int B=numbers.nextInt();

        //Pedimos valor para C
        System.out.println("Introduzca valor para C");
        int C=numbers.nextInt();

        double divisor, x1, x2;

        //Comprobamos la raiz es negativa en caso de ser positiva seguimos calculando
        if (Math.pow(B,2)-4*A*C <0){
            System.out.println("Raiz negativa");
        }else{
            x1=(-B+Math.sqrt(Math.pow(B,2)-4*A*C))/2*A;
            x2=(-B-Math.sqrt(Math.pow(B,2)-4*A*C))/2*A;
            System.out.println("Primer valor de X: "+x1);
            System.out.println("Segundo valor de X: "+x2);
        }
    }
}
