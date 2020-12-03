package conditionals;

import java.util.Scanner;
public class Ej1Condicionales {
        //El programa Ej1Condiciolanes preguntara al usuario un dia de la semana y devolvera que asignatura toca a primera hora ese dia
        public static void main(String[] args) {
            //Declaramos variable
            String dia;
            Scanner semana=new Scanner(System.in);
            //Preguntamos al usuario que dia de la semana es
            System.out.print("Introduzca un dia de la semana:");
            dia=semana.nextLine();
        /*Iniciamos un condicional que dependiendo del valor de la variable dia nos devolvera que materia toca segun el dia
        para evitar errores de formato segun se haya escrito el dia de la semana compararemos su valor en mayusculas*/
            if(dia.toUpperCase().equals("LUNES")){
                System.out.println("Hoy a primera hora toca: FOL");
            }else if(dia.toUpperCase().equals("MARTES")) {
                System.out.println("Hoy a primera hora toca: FOL");
            }else if(dia.toUpperCase().equals("MIERCOLES")){
                System.out.println("Hoy a primera hora toca: Programación");
            }else if(dia.toUpperCase().equals("JUEVES")){
                System.out.println("Hoy a primera hora toca: FOL");
            }else if(dia.toUpperCase().equals("VIERNES")){
                System.out.println("Hoy a primera hora toca: CI");
            }else if (dia.toUpperCase().equals("SABADO")||dia.toUpperCase().equals("DOMINGO")){
                System.out.println("Fin de semana no hay clase");
            }else{
                System.out.println("No es un dia de la semana valido");
            }
        }
    }
