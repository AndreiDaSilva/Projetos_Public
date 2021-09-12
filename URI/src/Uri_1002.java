import java.util.Scanner;
import java.text.DecimalFormat;
public class Uri_1002  {
       public static void main(String[] args) {

        DecimalFormat df_4 = new DecimalFormat("0.0000");
        Scanner tec = new Scanner (System.in);
            
            // Entrada
            double raio = tec.nextDouble();
            double pi = 3.14159;
                
            // Processo
            double area = pi * (raio * raio);
            
            // Saída
            System.out.println("A=" + df_4.format(area));

        tec.close();
                
    }
}
//finalizado