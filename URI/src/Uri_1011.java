import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1011 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");

        double raio = tec.nextDouble();
        double pi = 3.14159;

        double volume = (4*pi*(Math.pow(raio, 3)))/3;

        System.out.println("VOLUME = " + df_3.format(volume));
        
        tec.close();

    }
    
}
//finalizado