package clazz;

public class EjClase9 {
    //Haremos la calse y metodos de la clase caballo
    public static void main(String[] args) {

    }
    public static class caballo{
        boolean lleno, dormido;
        private int edad, peso, altura;
        private int[][] posicion = new int[10][10];
        private String Nombre, raza;

        public String GetData(){
            return "El caballo se llama" + Nombre + "es un " + raza + "Tiene" + edad + "pesa" + peso + "y mide" +altura;
        }

        public int[][] correr(){

            System.out.print("Posicion: ");
            return posicion;
        }

        public boolean comer(){
            return lleno;
        }

        public boolean dormir(){
            return dormido;
        }
    }
}
