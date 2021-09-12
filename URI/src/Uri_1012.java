import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Uri_1012 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");

        //Entrada
        double ValorA = tec.nextDouble();
        double ValorB = tec.nextDouble();
        double ValorC = tec.nextDouble();

        //Processo
        double Triangulo = ((ValorA*ValorC)/2);
        double Circulo = 3.14159 * Math.pow(ValorC, 2) ;
        double Trapezio = (((ValorA+ValorB)*ValorC)/2);
        double Quadrado = (Math.pow(ValorB, 2));
        double Retangulo = (ValorA*ValorB);

        //Saida
        System.out.println("TRIANGULO: " + df_3.format(Triangulo));
        System.out.println("CIRCULO: " + df_3.format(Circulo));
        System.out.println("TRAPEZIO: " + df_3.format(Trapezio));
        System.out.println("QUADRADO: " + df_3.format(Quadrado));
        System.out.println("RETANGULO: " + df_3.format(Retangulo));
        
        tec.close();
        
    }
    
}
//finalizado