public class EjBucles4 {
    //Este programa empezara en 320 y bajara de 20 en 20 hasta 160 y lo imprimira por pantalla usando un bucle for
    public static void main(String[] args) {
        int num1=320;
        int i=0;
        //Para bajar hasta 160 hace falta resta 20 8 veces asi que recorrermos el bucle 8 veces
        for (i=0;i<8;i++){
            System.out.println(num1);
            num1=num1-20;
        }
    }
}
