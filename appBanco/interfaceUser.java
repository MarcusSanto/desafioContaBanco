package appBanco;
import java.util.Locale;
import java.util.Scanner;

public class interfaceUser {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Java!");
        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String lastName = sc.nextLine();
        System.out.print("Digite seu CPF: ");
        String CPF = sc.nextLine();

        contaUsuario.contaBanco conta = new contaUsuario.contaBanco(name, lastName, CPF);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Mostrar dados da conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar valor");
            System.out.println("4 - Sacar valor");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> conta.mostrarDadosConta();
                case 2 -> conta.consultarSaldo();
                case 3 -> {
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = sc.nextDouble();
                    conta.depositarValor(deposito);
                }
                case 4 -> {
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = sc.nextDouble();
                    conta.sacarValor(saque);
                }
                case 0 -> System.out.println("Obrigado por usar o Banco Java. Até logo!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();



    }
        
}
