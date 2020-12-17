package DiesEntreDates;

public class Main {
    public static void main(String[] args) {
        DiesEntreDates_Miguel_Serna d1 = new DiesEntreDates_Miguel_Serna();
        try {
            DataXS data3 = new DataXS("12/12/2017");
            DataXS data4 = new DataXS("01/01/2018");
            System.out.println("Fecha inicio 1: " + data3.toString());
            System.out.println("Fecha destino 1: " + data4.toString());
            System.out.println(d1.nombreDiesTotals(data3,data4));

            DataXS data1 = new DataXS("09/04/2000");
            DataXS data2 = new DataXS("17/12/2020");
            System.out.println("Fecha inicio 2: " + data1.toString());
            System.out.println("Fecha destino 2: " + data2.toString());
            System.out.println(d1.nombreDiesTotals(data1,data2));

            DataXS data5 = new DataXS("06/03/2000");
            DataXS data6 = new DataXS("17/12/2020");
            System.out.println("Fecha inicio 3: " + data5.toString());
            System.out.println("Fecha destino 3: " + data6.toString());
            System.out.println(d1.nombreDiesTotals(data5,data6));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
