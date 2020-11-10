import java.util.Scanner;

public class Ej8Condicionales {
    public static void main(String[] args) {
        Scanner medias=new Scanner(System.in);

        //Declaramos variables
        float num, total=0, media;

        //Hacemos un bucle para que nos introduzcan las 3 notas y nos las sume en una variable
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduzca sus notas: ");
            num=medias.nextFloat();
            total=total+num;
        }

        //Calculamos la media aritmetica
        media=total/3;

        //Traducimos a lo academico
        if (media<=4){
            System.out.println("insuficiente");
        }else if (media==5){
            System.out.println("Suficente");
        }else if (media==6){
            System.out.println("Bien");
        }else if (media>6 && media<9){
            System.out.println("Notable");
        }else{
            System.out.println("Excelente");
        }
    }
}
