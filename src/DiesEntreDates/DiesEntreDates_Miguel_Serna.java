package DiesEntreDates;

public class DiesEntreDates_Miguel_Serna extends CalcularDiesEntreDates{

    //Array con los dias de cada mes
    private final int[] diaMes = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};


    //Miramos los dias
    @Override
    protected int diesMes(int mes) {
        return this.diaMes[mes - 1];
    }

    //Calcular los dias que quedan de mes
    @Override
    protected int diesMesInicial(DataXS dataXS) {
        return  this.diesMes(dataXS.mes) - dataXS.dia;
    }

    //Calcular dias que han pasado del mes destino
    @Override
    protected int diesMesDesti(DataXS dataXS) {
        return this.diaMes[dataXS.mes - 1] - (diesMes(dataXS.mes) - dataXS.dia);
    }

    //Calcular dias que quedan del año inicial - los que han pasado del mes inicial
    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {
        int diarestantsinici = this.diesMesInicial(datainicial);
        for (int i = datainicial.mes; i < 12; i++) {
            diarestantsinici += this.diaMes[i];
        }
        return diarestantsinici - this.diesMesInicial(datainicial);
    }

    //Calcular dias que han pasado del año destino - los que han pasado del mes destino
    @Override
    protected int diesResteAnyDesti(DataXS datadesti) {
        int diesrestantsdesti = this.diesMesDesti(datadesti);
        for (int i = 0; i < datadesti.mes - 1; i++) {
            diesrestantsdesti += diaMes[i];
        }
        return diesrestantsdesti - this.diesMesDesti(datadesti);
    }

    //Calcular los dias de los años completos entre las 2 fechas de años no bisiestos
    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        int diasAnyComplets = 0;
        for (int i = datainicial.any + 1; i < datainicial.any + (datadesti.any - datainicial.any); i++){
            if (!anyDeTraspas(i)) diasAnyComplets += 365;
        }
        return diasAnyComplets;
    }

    //Calcular los dias de los años completos entre las 2 fechas de años bisiestos
    @Override
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        int diasAnyTraspass = 0;
        for (int i = datainicial.any + 1; i < datainicial.any + (datadesti.any - datainicial.any); i++){
            if (anyDeTraspas(i)) diasAnyTraspass += 366;
        }
        return diasAnyTraspass;
    }

    //Calcular si el año es bisiesto
    @Override
    protected boolean anyDeTraspas(int any) {
        this.diaMes[1] = 29;
        return (any % 400 == 0) || ((any % 4 == 0) && !(any % 100 == 0));
    }
}