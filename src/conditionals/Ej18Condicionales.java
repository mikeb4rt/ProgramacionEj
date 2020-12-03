package conditionals;

import java.util.Scanner;

public class Ej18Condicionales {
    //Este programa recibira un numero de maximo 5 cifras y comprobara si es capicua
    public static void main(String[] args) {
        Scanner capi=new Scanner(System.in);
        int cua= capi.nextInt(),invertido=0,resto;

        while(cua>0){
            resto=cua%10;
            invertido=invertido*10+resto;
            cua=cua/10;
        }
        System.out.println(invertido);
        if (Integer.toString(cua).length()<6){
            System.out.println("Mas de 5 cifras");
        }else if (cua==invertido){
            System.out.println("capicua");
        } else{
            System.out.println("No capicua");
        }
    }
}
