package conditionals;

import java.util.Scanner;

public class Ej11Condicionales {
    public static void main(String[] args) {
        Scanner moment=new Scanner(System.in);

        //Declaramos varibles y imprimos por pantalla un mensaje para el usuario
        float counterM=0,counterH=0,tillmidnight;

        System.out.print("Que hora es? ");
        int hour=moment.nextInt();

        System.out.print("Que minuto es? ");
        int minut=moment.nextInt();

        //Comprobamos que sea medianoche
        if (hour==24 && minut==0){
            System.out.println("Ya es medianoche");

        //Contamos cuantos minutos quean para 60 y cuantas horas quedan para las 24 para luego tenerlo todo en horas y pasarlo a segundos
        }else if (minut<60 || hour<23){
            for (int i = minut; i < 60; i++) {
                counterM++;
                System.out.println(counterM);
            }
            for (int i = hour; i <23 ; i++) {
                counterH++;
            }
            System.out.println(counterM);
            System.out.println(counterH);
            tillmidnight=((counterM/60)+counterH)*3600;
            System.out.println("Para media noche quedan: "+tillmidnight+" segundos");

        //Si no se adapta no es una hora valida
        }else{
            System.out.println("Hora no valida");
        }
    }
}

