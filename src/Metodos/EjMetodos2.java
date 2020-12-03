package Metodos;

public class EjMetodos2 {
    public static void main(String[] args) {
        roundOut redond1 = new roundOut(5);
        roundOut redond2 = new roundOut(7.8);
        roundOut redond3 = new roundOut(-2);
        roundOut redond4 = new roundOut(1.2);

        System.out.println(redond2.roundNear());
        System.out.println(redond2.roundDown());
        System.out.println(redond4.roundNear());
        System.out.println(redond4.roundDown());
    }
    public static class roundOut{
        private double _X;
        private int _Y;

        //Construtor
        public roundOut(double x){
            this.SetX(x);
        }

        //Getters

        //Devuelve el valor de X
        public double GetX(){
            return this._X;
        }

        //Devuelve el valor de Y
        public double GetY(){
            return this._Y;
        }

        //Setters
        public void SetX(double x){
            this._X = x;
        }

        //Metodo para redondear hacia arriba
        public String roundUp(){
            return "Numero original: " + this._X + " numero redondeado hacia arriba " + (int)Math.ceil(this._X);
        }

        //Metodo para redondear hacia abajo
        public String roundDown(){
            return "Numero original: " + this._X + " numero redondeado hacia abajo " + (int)Math.floor(this._X);
        }

        //Rodondear para el numero mas cercano
        public String roundNear(){
            return "Numero original: " + this._X + " numero redondeado hacia numero mas cercano " + (int)Math.floor(this._X + 0.5);
        }
    }
}
