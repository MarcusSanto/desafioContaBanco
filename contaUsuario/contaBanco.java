package contaUsuario;

public class contaBanco {

    private String name;
    private int accountNumb;
    private String CPF;
    private double saldo;
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAccountNumb() {
        return accountNumb;
    }
    public void setAccountNumb(int accountNumb) {
        this.accountNumb = accountNumb;
    }  
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
}
