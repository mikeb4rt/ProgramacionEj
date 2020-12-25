package OrdenarArray;

public class OrdenarArray {
    public static void main(String[] args) {
       int[] miarray = new int[]{3,2,8,1,5,7,4};
        ordenarArrayMm(miarray);

        for (int array : miarray) {
            System.out.print(array + ", ");
        }
    }

    public static int[] ordenarArraymM(int[] array){
        int apoyo;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    apoyo = array[i];
                    array[i] = array[j];
                    array[j] = apoyo;
                }
            }
        }
        return array;
    }

    public static int[] ordenarArrayMm(int[] array){
        int apoyo;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]){
                    apoyo = array[i];
                    array[i] = array[j];
                    array[j] = apoyo;
                }
            }
        }
        return array;
    }
}
