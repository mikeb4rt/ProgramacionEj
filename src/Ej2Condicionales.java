import java.util.Scanner;
public class Ej2Condicionales {
    //El programa Ej2Condicionales devolvera por pantalla Bon dia, Bona tarda, Bon vespre, Bona nit
    public static void main(String[] args) {
        //Declaramos variables
        int hora;
        Scanner horario= new Scanner(System.in);
        //Pedimos la hora al usuario
        System.out.print("Introduzca una hora:");
        hora= horario.nextInt();
        //Iniciamos un condicional que dependiendo de la hora nos devolvera un saludo difirente
        if (hora>=6 && hora<=12){
            System.out.println("Bon dia");
        }else if (hora>=13 && hora<=19){
            System.out.println("Bona tarda");
        }else if (hora>=20 && hora<=22){
            System.out.println("Bon vespre");
        }else if(hora==23 || hora<=5) {
            System.out.println("Bona nit");
        }else{
            System.out.println("La hora especificada no esta en el margen horario");
        }
    }
}
