package clazz;

public class EjClase5 {

    public static void main(String[] args) {

    }

    public static class persona{
        private int edad, peso, altura;
        private String nombre, apellido;
    }

    public static class  jugador extends  persona{
        private String posicion;
        private int dorsal;
    }

    public static class equipo{
        private String nombre, logo;
    }

    public static class partido{
        private int fecha, marcador;
    }

    public static class balon{
        private int peso, tamaño, radio, material;
    }
}
