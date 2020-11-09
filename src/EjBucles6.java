public class EjBucles6 {
    //este programa reducira de 20 en 20 320 hasta 160 utilizando un bucle do while
    public static void main(String[] args) {
        int numInicial=360;
        do{
            System.out.println(numInicial);
            numInicial=numInicial-20;
        }while (numInicial>=160);
    }
}
