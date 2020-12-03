package conditionals;

import java.util.Scanner;
public class Ej4Condicionales {
    //Este programa calculara el salrio de un trabajador que cobra 12€/h las primeras 40 y partir de alli 16€/h
    public static void main(String[] args) {
        //Declaramos variables
        Scanner horasTotales= new Scanner(System.in);
        int horasExtra;
        int salarioExtra;
        int salarioTotal;
        //Calculamos su salio base por semana
        int salarioBase=40*12;
        //Pedimos al usuario cuantas horas extra ha trabajado
        System.out.print("Cuantas hora extra ha trabajado esta semana");
        horasExtra=horasTotales.nextInt();
        //Calculamos cuanto es ha ganado por las horas extra
        salarioExtra=horasExtra*16;
        salarioTotal=salarioExtra+salarioBase;
        //Imprimimos por pantalla el salrio total del trabajador
        System.out.println("Su salraio es: "+salarioTotal);
    }
}
