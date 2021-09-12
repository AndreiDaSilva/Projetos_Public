import java.util.Scanner;

public class Uri_1013 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int A = tec.nextInt();
        int B = tec.nextInt();
        int C = tec.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorBC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(maiorBC + " eh o maior");

        tec.close();
    }

}
//finalizado