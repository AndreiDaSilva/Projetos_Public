import java.util.Scanner;

public class URI_1041 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double x = tec.nextDouble();
        double y = tec.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else {
            if (x == 0) {
                System.out.println("Eixo Y");
            } else {
                if (y == 0) {
                    System.out.println("Eixo X");
                } else {
                    if (y > 0 && x > 0) {
                        System.out.println("Q1");
                    } else {
                        if (y > 0 && x < 0) {
                            System.out.println("Q2");
                        } else {
                            if (y < 0 && x < 0) {
                                System.out.println("Q3");
                            } else {
                                if (y < 0 && x > 0) {
                                    System.out.println("Q4");
                                }
                            }
                        }
                    }
                }
            }
        }

        tec.close();
    }
}
//finalizado