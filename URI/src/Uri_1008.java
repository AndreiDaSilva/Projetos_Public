import java.util.Scanner;
import java.text.DecimalFormat;

    public class Uri_1008 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        
        //entrada
        int numColaborador = tec.nextInt();
        int horasTrabalhada = tec.nextInt();
        double valorHora = tec.nextDouble();

        //Processo
        double salario = (horasTrabalhada*valorHora);


        //saida
        System.out.println("NUMBER = " + numColaborador);
        System.out.println("SALARY = U$ " + df_2.format(salario));

        
        tec.close();
    }
}
//finalizado
