package loops;

public class EjBucles3 {
    //este programa calculara los multiplos de 5 desde el 0-100 utilizando un bucle while
    public static void main(String[] args) {
        int contador = 0;
        do{
            int multiplo5 = 5 * contador;
            contador++;
            System.out.println(multiplo5);
        }while (contador <= 100);
    }
}
