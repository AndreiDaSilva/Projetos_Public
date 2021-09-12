import java.util.Scanner;
import java.text.DecimalFormat;
public class Uri_1010 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        //entrada
        int codPecaA = tec.nextInt();
        int numePecaA = tec.nextInt();
        double valorPecaA = tec.nextDouble();

        int codPecaB = tec.nextInt();
        int numePecaB = tec.nextInt();
        double valorPecaB = tec.nextDouble();

        //Processo
        double totalPago = ((numePecaA * valorPecaA) + (numePecaB * valorPecaB));

        //Saida
        System.out.println("VALOR A PAGAR: R$ " + df_2.format(totalPago));
        tec.close();
    }
    
}
//finalizado