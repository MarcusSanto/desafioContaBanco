package contaUsuario;

/**
 * @author MarcusSantos
 */

public class contaBanco {

    private String name;
    private String lastName;
    private final int accountNumb = (int) (Math.random() * 10000);
    private final String CPF;
    private double saldo;

 /**
     * @param name Nome do usuário
     * @param lastName Sobrenome do usuário
     * @param CPF CPF do usuário
     */

    public contaBanco(String name, String lastName, String CPF) {
        this.name = name;
        this.lastName = lastName;
        this.CPF = CPF;
        this.saldo = 0.0;
    }

    public void mostrarDadosConta(){
        System.out.println("Nome: " + this.name + " " + this.lastName);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Número da Conta: " + this.accountNumb);
        System.out.println("Saldo: R$ " + String.format("%.2f", this.saldo));
    }

    public void consultarSaldo(){
        System.out.println("\n>> Saldo atual: R$ " + String.format("%.2f", this.saldo));
    }

    public void depositarValor(double valor){
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("\n>> Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
            consultarSaldo();
        } else {
            System.out.println("\n>> Valor de depósito inválido. Tente novamente.");
        }
    }

    public void sacarValor(double valor){
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("\n>> Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
            consultarSaldo();
        } else {
            System.out.println("\n>> Saldo insuficiente ou valor inválido para saque.");
        }
    }

}
