import java.util.Scanner;

public class Uri_1018 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Entrada
        int valorCelula = tec.nextInt();

        //Proceso
        int nota100 = valorCelula / 100;
        int nota50 = (valorCelula % 100)  / 50;
        int nota20 = ((valorCelula % 100) % 50) / 20;
        int nota10 = (((valorCelula % 100) % 50) % 20) / 10;
        int nota5 = ((((valorCelula % 100) % 50) % 20) % 10) / 5;
        int nota2 = (((((valorCelula % 100) % 50) % 20) % 10) % 5) / 2;
        int nota1 = ((((((valorCelula % 100) % 50) % 20) % 10) % 5) % 2) / 1;
  
        //Saida
        System.out.println(valorCelula);
        System.out.println(nota100 +" nota(s) de R$ 100,00");
        System.out.println(nota50 +" nota(s) de R$ 50,00");
        System.out.println(nota20 +" nota(s) de R$ 20,00");
        System.out.println(nota10 +" nota(s) de R$ 10,00");
        System.out.println(nota5 +" nota(s) de R$ 5,00");
        System.out.println(nota2 +" nota(s) de R$ 2,00");
        System.out.println(nota1 +" nota(s) de R$ 1,00");
      
                
        
        tec.close();
        
    }
    
}
//finalizado