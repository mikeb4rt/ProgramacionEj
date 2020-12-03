package Metodos;

import java.util.Scanner;

public class EjMetodos3 {
    public static void main(String[] args) {
        Scanner factores = new Scanner(System.in);

        boolean salir =  false;

        do{
            //Pedimos al usuario que introduzca el numero decimal que quiere redondear y que decimal quiere redondear
            System.out.print("Introduzca un numero decimal: ");
            double x = factores.nextDouble();
            System.out.print("Introduzca 10, 100 o 100 si introduce otro numero saldra del programa: ");
            int decimal = factores.nextInt();

            if (decimal == 10){
                roundTenNear(x, decimal);
            }else if (decimal == 100){
                roundHundredNear(x, decimal);
            }else if (decimal == 1000){
                roundThousandNear(x, decimal);
            }else {
                System.out.println("Decimal no es ni 10 ni 100 ni 1000");
            }
            if (decimal != 10 && decimal != 100 && decimal != 1000)
                salir = true;
        }while (!salir);
    }

        //Redondeara el numero decimal al mas cercano
        public static void roundTenNear ( double x, int decimal){
            System.out.println("Numero original: " + x + " numero redondeado su posicion decimal al numero mas cercano " + Math.floor(x * decimal + 0.5) / decimal);
        }

        //Redonde el numero decimal hacia abajo
        public static void roundTenDown ( double x, int decimal){
            System.out.println("Numero original: " + x + " numero redondeado su posicion decimal hacia abajo " + Math.floor(x * decimal + 0.5) / decimal);
        }

        //Redondea el numero decimal hacia arriba
        public static void roundTenUp ( double x, int decimal){
            System.out.println("Numero original: " + x + " numero redondeado su posicion decimal hacia arriba " + Math.ceil(x * decimal + 0.5) / decimal);
        }

        //Redondeara el numero centesimal al mas cercano
        public static void roundHundredNear ( double x, int decimal){
            System.out.println("Numero original: " + x + " numero redondeado su posicion decimal al numero mas cercano " + Math.floor(x * decimal + 0.5) / decimal);
        }

        //Redonde el numero centesimal hacia abajo
        public static void roundHundredDown ( double x, int decimal){
            System.out.println("Numero original: " + x + " numero redondeado su posicion decimal hacia abajo " + Math.floor(x * decimal + 0.5) / decimal);
        }

        //Redondea el numero centesimal hacia arriba
        public static void roundHundredUp ( double x, int decimal){
            System.out.println("Numero original: " + x + " numero redondeado su posicion decimal hacia arriba " + Math.ceil(x * decimal + 0.5) / decimal);
        }

        //Redondeara el numero milesima al mas cercano
        public static void roundThousandNear ( double x, int decimal){
            System.out.println("Numero original: " + x + " numero redondeado su posicion decimal al numero mas cercano " + Math.floor(x * decimal + 0.5) / decimal);
        }

        //Redonde el numero milesima hacia abajo
        public static void roundThousandDown ( double x, int decimal){
            System.out.println("Numero original: " + x + " numero redondeado su posicion decimal hacia abajo " + Math.floor(x * decimal + 0.5) / decimal);
        }

        //Redondea el numero milesima hacia arriba
        public static void roundThousandUp ( double x, int decimal){
            System.out.println("Numero original: " + x + " numero redondeado su posicion decimal hacia arriba " + Math.ceil(x * decimal + 0.5) / decimal);
        }
    }

