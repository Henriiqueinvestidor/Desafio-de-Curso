import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu numero de vitoria");
        int vitoria = entrada.nextInt();

        System.out.println("Digite seu numero de derrota");
        int derrota = entrada.nextInt();

        int saldo = calcularSaldo(vitoria, derrota);

        String nivel = calcularNivel(vitoria);

        System.out.println("O Heroi tem de saldo de " + saldo
                + " está no nível de " + nivel);
    }

    public static int calcularSaldo(int vitoria, int derrota) {
        return vitoria - derrota;
    }

    public static String calcularNivel(int vitoria) {

        if (vitoria <= 10) {
            return "ferro";

        } else if (vitoria <= 20) {
            return "bronze";

        } else if (vitoria <= 50) {
            return "prata";

        } else if (vitoria <= 80) {
            return "ouro";

        } else if (vitoria <= 90) {
            return "diamante";

        } else if (vitoria <= 100) {
            return "lendario";

        } else {
            return "imortal";
        }
    }
}