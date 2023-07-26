package main.entities;

public class Conta {
    private final int numeroConta;
    private String nomeTitular;
    private double valDepositoInicial;
    private double saldoConta;

    public Conta(int numeroConta, String nomeTitular, double valDepositoInicial) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.valDepositoInicial = valDepositoInicial;
        this.saldoConta = valDepositoInicial;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void depositarDinheiro(double qtd) {
        this.saldoConta += qtd;
    }

    public void sacarDinheiro(double qtd) {
        if (this.saldoConta - qtd >= 0) {
            this.saldoConta -= qtd;
            this.saldoConta -= 5; // taxa de saque
        } else {
            System.out.println("Saldo indisponível");
        }
    }

    public String toString() {
        return "Conta " +
                numeroConta +
                ", Titular: " +
                nomeTitular +
                ", Saldo: $ " +
                String.format("%.2f", saldoConta);
    }

}
