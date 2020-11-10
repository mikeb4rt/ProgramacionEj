import java.util.Scanner;

public class Ej7Condicionales {
    //Este programa calcuara la media aritmetica de 3 notas dadas por el usuario
    public static void main(String[] args) {
        Scanner medias=new Scanner(System.in);

        //Declaramos variables
        float num, total=0;

        System.out.println("Introduzca sus notas");
        for (int i = 0; i < 3; i++) {
            num=medias.nextFloat();
            total=total+num;
        }
        System.out.println("La media aritmetica es: "+total/3);
    }
}
