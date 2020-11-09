public class EjBucles1 {
    public static void main(String[] args){
    //este programa calculara los multiplos de 5 desde el 0-100 utilizando un bucle for
        int i;
        //En el bucle incrementaremos un contador i y los multiplicaremos por 5 hasta que el contador llegue 100
        for (i=0;i<=100;i++){
            //guardamos la multiplicación
            int multiplos5=5*i;
            //imprimimos el resultado de la multiplicación
            System.out.println(multiplos5);
        }
    }
}
