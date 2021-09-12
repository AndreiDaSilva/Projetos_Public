import java.util.Scanner;

public class URI_1046 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int horaInicial = tec.nextInt();
        int horaFinal = tec.nextInt();

        int duração = (24 - (horaInicial - horaFinal));
        int duração1 = horaFinal - horaInicial;

        if (horaInicial > horaFinal) {
            System.out.println("O JOGO DUROU " + duração + " HORA(S)");
        } else {
            if (horaInicial < horaFinal) {
                System.out.println("O JOGO DUROU " + duração1 + " HORA(S)");
            } else {
                System.out.println("O JOGO DUROU 24 HORA(S)");
            }
        }
        tec.close();
    }
}
//finalizado