package conditionals;

import java.util.Scanner;

public class Ej17Condicionales {
    public static void main(String[] args) {
        Scanner NumInt=new Scanner(System.in);
        int Num=NumInt.nextInt();

        if (Num>=0 && Integer.toString(Num).length()<6) {
            System.out.println("El numero tiene " + Integer.toString(Num).length() + " cifras");
        }else if (Num<0 && Integer.toString(Num).length()<7){
            System.out.println(Integer.toString(Num).length()-1);
        }else{
            System.out.println("tiene mas de 5 cifras");
        }
    }
}
