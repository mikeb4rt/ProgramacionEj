package conditionals;

import java.util.Scanner;
public class Ej3Condicionales {
    //Es clase pedira un numero del 1 al 7 y dependiendo del mismo delvolvera un dia de la semana
    public static void main(String[] args) {
    //Declaramos variables
        Scanner numS= new Scanner(System.in);
        //Pedimos un numero del 1-7 al usuario
        System.out.print("Introduzca un numero del 1-7:");
        int Dia=numS.nextInt();
        if (Dia==1){
            System.out.println("Hoy es lunes");
        }else if (Dia==2){
            System.out.println("Hoy es martes");
        }else if (Dia==3){
            System.out.println("Hoy es miércoles");
        }else if (Dia==4){
            System.out.println("Hoy es jueves");
        }else if (Dia==5){
            System.out.println("Hoy es viernes");
        }else if (Dia==6){
            System.out.println("Hoy es sábado");
        }else if (Dia==7){
            System.out.println("Hoy es domingo");
        }else{
            System.out.println("Numero fuera del rango o no es un numero");
        }
    }
}
