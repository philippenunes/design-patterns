package state.contabancaria;

public class SaldoNegativo implements EstadoContaBancaria {

    public void saque(Conta conta, double valorSaque) {
        throw new RuntimeException("Contas com saldo negativo não aceitam saques!");
    }

    public void deposito(Conta conta, double valorDeposito) {
        conta.saldo = conta.saldo + (valorDeposito * 0.95);
        if(conta.saldo > 0) conta.estado = new SaldoPositivo();
        System.out.println("Saldo da conta após depósito: " + conta.saldo);
    }
}
