package Coche;

public class CotxeSegonaPart_Miguel_Serna extends Coche_Miguel_Serna {

    protected Marcha marcha;

    //Constructor
    public CotxeSegonaPart_Miguel_Serna(String marca, String model, TipusCanvi tipuscanvi, EstadoMotorCoche estadocoche) {
        super(marca, model, tipuscanvi, estadocoche);
        this.marcha = Marcha.N;
    }



    //Getters
    public Marcha getmarcha(){
            return this.marcha;
        }


    //Setters
    public void setmarcha(Marcha cambio){ {
            this.marcha = cambio;
        }
    }

    //Methods

    //Metodo para Subir/Bajar la marcha del coche automatico
    public void CanviarMarchaManual (char cambio) throws Exception {
        //Comprobamos si el coche es manual si no tiramos una excepcion
        if (this.tipuscanvi == TipusCanvi.CanviManual) {
            Marcha[] total = Marcha.values();
            if (cambio == '+') {
                    if (this.getmarcha().equals(total[total.length - 1])) {
                        throw new Exception("Esta en la marcha mas alta");
                    } else {
                            boolean cambiar = false;
                            int i = 0;
                            while (!cambiar){
                                    if (this.marcha == total[i]){
                                        this.setmarcha(total[i + 1]);
                                        cambiar = true;
                                    }
                                    i++;
                            }
                    }
            } else if (cambio == '-') {
                    if (this.getmarcha().equals(total[0])) {
                        throw new Exception("Esta en la marcha mas baja");
                    } else  {
                        boolean cambiar = false;
                        int i = 0;
                        while (!cambiar) {
                            if (this.getmarcha().equals(total[i])) {
                                this.setmarcha(total[i - 1]);
                                cambiar = true;
                            }
                            i++;
                        }
                    }

            } else throw new Exception("Parametro incorrecto");
        }else throw new Exception("El coche no es manual");
    }

    //Metodo para Subir/Bajar la marcha del coche automatico
    public void CanviarMarchaAutomatica(char cambio) throws Exception{
        if (this.tipuscanvi == TipusCanvi.CanviAutomatic){
            Marcha[] total = new Marcha[]{Marcha.R,Marcha.N,Marcha.U};
            if (cambio == '+') {
                if (this.getmarcha().equals(total[total.length - 1])) {
                    throw new Exception("Esta en la marcha mas alta");
                }else {
                    boolean cambiar = false;
                    int i = 0;
                    while (!cambiar){
                        if (this.getmarcha().equals(total[i])){
                            this.setmarcha(total[i + 1]);
                            cambiar = true;
                        }
                        i++;
                    }
                }
            } else if (cambio == '-'){
                if (this.getmarcha().equals(total[0])){
                    throw new Exception("Esta en la marcha mas baja");
                } else {
                    boolean cambiar = false;
                    int i = 0;
                    while (!cambiar){
                        if (this.getmarcha().equals(total[i])){
                            this.setmarcha(total[i - 1]);
                            cambiar = true;
                        }
                        i++;
                    }
                }
            } else throw new Exception("Parametro no valido");
        }else throw new Exception("El coche no es automatico");
    }
}