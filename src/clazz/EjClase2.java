package clazz;

public class EjClase2 {
    //Este programa declarara una clase piloroF1
    public static void main(String[] args) {

        PilotoF1 Piloto1;
        Piloto1 = new PilotoF1();
        System.out.println(Piloto1.GetDta());

    }

    public static class PilotoF1{

        //Atributos de la clase
        private String nombre="Fernando", apellido="Alonso", escuderia="Ferrrari", nacionalidad="Español";
        private int puntos=100;

        public String GetDta(){

            return nombre + ", " + apellido + ", " + escuderia + ", " + nacionalidad + ", " + puntos;
        }
    }
}
