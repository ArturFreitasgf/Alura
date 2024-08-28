import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        double saldoDaConta = 0;
        String nome;

        System.out.println("Bem vindo ao Banco!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta: ");
        nome = sc.nextLine();
        System.out.println("Digite o tipo de conta desejado!");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        int tipoConta = sc.nextInt();
        switch (tipoConta) {
            case 1:
                System.out.println("Conta Corrente criada com sucesso!");
                break;
            case 2:
                System.out.println("Conta Poupança criada com sucesso!");
                break;
            default:
                System.out.println("Tipo de conta inválido!");
                System.out.println("Digite o tipo de conta desejado!");
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                tipoConta = sc.nextInt();
                switch (tipoConta) {
                    case 1:
                        System.out.println("Conta Corrente criada com sucesso!");
                        break;
                    case 2:
                        System.out.println("Conta Poupança criada com sucesso!");
                        break;
                    default:
                        return;
                }
                return;
        }
        System.out.println("Digite o valor do Saldo inicial: ");
        double saldoInicial = sc.nextDouble();
        saldoDaConta += saldoInicial;
        System.out.println("Conta criada com sucesso!");
        System.out.println("******************************************");
        System.out.println("Titular da conta:       " + nome);
        System.out.println("Tipo de conta:          " + tipoConta);
        System.out.println("Saldo atual:          R$" + saldoDaConta);
        System.out.println("*******************************************");

        while (true) {
            System.out.println("Operações disponíveis: ");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            int operação = sc.nextInt();

            switch (operação) {
                case 1:
                    System.out.println("Saldo atual: R$" + saldoDaConta);

                    break;

                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = sc.nextDouble();
                    saldoDaConta += valorDeposito;
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido: ");
                    double valorTransferencia = sc.nextDouble();
                    saldoDaConta -= valorTransferencia;
                    break;
                case 4:
                    System.out.println("Sair");
                    return;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }

        }
    }
}