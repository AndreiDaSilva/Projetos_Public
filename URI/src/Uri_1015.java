import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Uri_1015 {
    public static void main(String[] args) {
        DecimalFormat df_4 = new DecimalFormat("0.0000");
        Scanner tec = new Scanner (System.in);

        //Entrada
        double x1 = tec.nextDouble();
        double y1 = tec.nextDouble();
        double x2 = tec.nextDouble();
        double y2 = tec.nextDouble(); 

        //Processo
        double distancia = Math.sqrt (Math.pow((x2 - x1),2) + Math.pow((y2-y1),2));

        //Saida
        System.out.println(df_4.format(distancia));

        tec.close();
    }
    
}
//finalizado