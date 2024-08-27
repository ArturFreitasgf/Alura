import java.util.Scanner;
import java.util.Random;

public class Advinhacao {
    public static void main(String[] args) {

        System.out.println("**********************************");
        System.out.println("*Bem vindo ao jogo de advinhacao!*");
        System.out.println("**********************************");
        System.out.println("O numero secreto esta entreo 0 e 99");

        Scanner sc = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um numero entre 0 e 100:");
            numeroDigitado = sc.nextInt();
            tentativas++;

            if (numeroSecreto == numeroDigitado) {
                System.out.println("Parabens, voce acertou o numero secreto em " + tentativas + "tentativas");
                break;
            } else if (numeroDigitado < numeroSecreto) {
                System.out.println("O numero " + numeroDigitado + " é menor que o numero secreto!");
            } else {
                System.out.println("O numero " + numeroDigitado + " é maior que o numero secreto!");
            }

        }
        if (tentativas == 5 && numeroSecreto != numeroDigitado) {
            System.out.println("Voce nao conseguir acertar o numero secreto!");
            System.out.println("O numero secreto era: " + numeroSecreto);

        }

    }

}
