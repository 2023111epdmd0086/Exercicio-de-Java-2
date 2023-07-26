package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.entities.Conta;

public class ContaTest {
    
    @Test
    public void testDepositarDinheiro(){
        Conta c1 = new Conta(123, "TESTES", 0);
        c1.depositarDinheiro(20);
        final double obtido = c1.getSaldoConta();
        final double esperado = 20;

        assertEquals(esperado, obtido);
    }
}
