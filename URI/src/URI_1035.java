import java.util.Scanner;

public class URI_1035 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Escreve o valores de A, B, C, D");
        int A = tec.nextInt();
        int B = tec.nextInt();
        int C = tec.nextInt();
        int D = tec.nextInt();

        if (B > C && D > A && C > 0 && D > 0 && (C + D) > (A + B)
                && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");

        }
        tec.close();
    }

}
//finalizado