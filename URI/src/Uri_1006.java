import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1006 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");

        Double A = tec.nextDouble();
        Double B = tec.nextDouble();
        Double C = tec.nextDouble();

        double media = ((A*2)+(B*3)+(C*5))/10;

        System.out.println("MEDIA = " + df_1.format(media));

        tec.close();
    }
    
}
//finalizado
