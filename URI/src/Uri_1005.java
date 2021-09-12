import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri_1005 {

public static void main(String[] args) {
    Scanner tec= new Scanner(System.in);
    DecimalFormat df_5= new DecimalFormat("0.00000");

    //Entrada
    double notaA= tec.nextDouble();
    double notaB= tec.nextDouble();

    //Processo

    double Media= ((notaA*3.5)+(notaB*7.5))/11;

    //Sáida
    System.out.println("MEDIA = " + df_5.format(Media));

    tec.close();

        
    }
    
}
//finalizado