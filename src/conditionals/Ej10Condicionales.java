package conditionals;

import java.util.Scanner;


public class Ej10Condicionales {
    //Este programa te devolvera tu signo del horoscopo segun la fecha que introduzcas
    public static void main(String[] args) {

        Scanner fecha = new Scanner(System.in);
        //Pedimos al usuario que introduzca dia
        System.out.print("Introduzca dia: ");
        int dia = fecha.nextInt();

        //Pedimos al usuario que introduzca mes
        System.out.print("Introduzca mes: ");
        int mes = fecha.nextInt();

        //Comprobamos que sean mes y dia validos
        if ((dia <= 0 || dia > 31) || (mes <= 0 || mes > 12)) {
            System.out.println("Dia y mes no validos");
        } else if ((dia > 20 && mes == 3) || (dia < 21 && mes == 4)){
            System.out.println("Eres Aries");
        } else if ((dia > 20 && mes == 4) || (dia < 21 && mes == 5)){
            System.out.println("Eres Tauro");
        } else if ((dia > 20 && mes == 5) || (dia < 21 && mes == 6)){
            System.out.println("Eres Geminis");
        } else if ((dia > 20 && mes == 6) || (dia < 21 && mes == 7)){
            System.out.println("Eres Cancer");
        } else if ((dia > 20 && mes == 7) || (dia < 21 && mes == 8)){
            System.out.println("Eres Leo");
        } else if ((dia > 20 && mes == 8) || (dia < 21 && mes == 9)){
            System.out.println("Eres Virgo");
        } else if ((dia > 20 && mes == 9) || (dia < 21 && mes == 10)){
            System.out.println("Eres Libra");
        } else if ((dia > 20 && mes == 10) || (dia < 21 && mes == 11)){
            System.out.println("Eres Escorpio");
        } else if ((dia > 20 && mes == 11) || (dia < 21 && mes == 12)){
            System.out.println("Eres Sagitario");
        } else if ((dia > 20 && mes == 12) || (dia < 18 && mes == 1)){
            System.out.println("Eres Capricornio");
        } else if ((dia > 19 && mes == 1) || (dia < 17 && mes == 2)){
            System.out.println("Eres Acuario");
        } else if ((dia > 17 && mes == 2) || (dia < 19 && mes == 3)){
            System.out.println("Eres Piscis");
        }
    }
}
