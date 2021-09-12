import java.util.Scanner;

public class Uri_1019 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Entrada
        int TempoDuracaoSegundos = tec.nextInt();
                
        //Processo
        
        int HH = TempoDuracaoSegundos / 3600;
        int MM = TempoDuracaoSegundos % 3600 / 60;
        int SS = TempoDuracaoSegundos % 60;
         

        //Saída
        System.out.println(HH+":"+MM+":"+SS);

        tec.close();
    }
}
//finalizado