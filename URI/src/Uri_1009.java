import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri_1009 {
    public static void main (String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        //entrada
        String nomeColaborador = tec.next();
        double salarioFixo = tec.nextDouble();
        double vendasTotais = tec.nextDouble();

        //processo
        double calculoComissao = ((vendasTotais * 0.15) + salarioFixo);
        double total = calculoComissao;
        //saida
        System.out.println("TOTAL = R$ " + df_2.format(total));

        tec.close();
    }
    
}
//finalizado