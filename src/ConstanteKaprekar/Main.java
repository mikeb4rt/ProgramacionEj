package ConstanteKaprekar;


public class Main {
    public static void main(String[] args) throws Exception {
        kaprekar k1 = new kaprekar(9423);
        System.out.println(k1.generarMenor(k1.numToArray(6713)));
    }
}
