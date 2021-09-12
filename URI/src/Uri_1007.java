import java.util.Scanner;
public class Uri_1007 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Entrada
        int ProdA = tec.nextInt();
        int ProdB = tec.nextInt();
        int ProdC = tec.nextInt();
        int ProdD = tec.nextInt();

        //Processo
        int diferenca = ((ProdA*ProdB)-(ProdC*ProdD));
        
        //Saida
        System.out.println("DIFERENCA = "+diferenca);
    
    tec.close();
    }
    
}
//finalizado
