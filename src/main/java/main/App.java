package main;

import java.util.Locale;
import java.util.Scanner;

import main.entities.Conta;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String nomeTitular;
        double valDepositoInicial;
        double valor;
        String auxiliar;

        System.out.print("Entre com o número da conta: ");
        numeroConta = Integer.parseInt(sc.nextLine());
        System.out.print("\nEntre com o nome do titular da conta: ");
        nomeTitular = sc.nextLine();
        System.out.print("\nHá um deposito inicial? (y/n) ");
        auxiliar = sc.next().toLowerCase();
        if (auxiliar.equals("y")) {
            System.out.print("\nEntre com o depósito inicial: ");
            valDepositoInicial = sc.nextDouble();
        } else {
            valDepositoInicial = 0;
        }
        Conta conta = new Conta(numeroConta, nomeTitular, valDepositoInicial);
        
        System.out.println("\nDados da conta:");
        System.out.println(conta.toString());

        System.out.print("Entre com um valor para depósito: ");
        valor = sc.nextDouble();
        conta.depositarDinheiro(valor);
        System.out.println(conta.toString());
        
        System.out.print("Entre com um valor para saque: ");
        valor = sc.nextDouble();
        conta.sacarDinheiro(valor);
        System.out.println(conta.toString());

        sc.close();
    }

}
