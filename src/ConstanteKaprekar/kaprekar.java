package ConstanteKaprekar;
import OrdenarArray.OrdenarArray;
public class kaprekar {
    int num;

    public kaprekar(int num){
        this.num = num;
    }

    //Getter
    public int getNum(){
        return this.num;
    }

    //Setter
    /*public void setNum(int num) throws Exception{
        if ()
    }*/
    public int[] numToArray(int num){
        String stringnum = Integer.toString(10000 + num);
        int temp;
        int[] Arraynum = new int[4];
            for (int i = 0; i < Arraynum.length; i++) {
                Arraynum[i] = Integer.parseInt(stringnum.substring(i + 1, i + 2));
        }
        return Arraynum;
    }

    public int generarMayor(int[] array){
        int mayor = 0;
        OrdenarArray.ordenarArrayMm(array);
        for (int i = 0; i < 4; i++) {
            mayor = mayor * 10 + array[i];
        }
        return mayor;
    }

    public int generarMenor(int[] array){
        int menor = 0;
        OrdenarArray.ordenarArraymM(array);
        for (int i = 3; i >= 0; i--) {
            menor = menor * 10 + array[i];
        }
        return menor;
    }
}
