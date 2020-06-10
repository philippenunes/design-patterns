package state.contabancaria;

public class SaldoPositivo implements EstadoContaBancaria {

    public void saque(Conta conta, double valorSaque) {
        conta.saldo -= valorSaque;
        if(conta.saldo < 0) conta.estado = new SaldoNegativo();
        System.out.println("Valor sacado: " + valorSaque);
    }

    public void deposito(Conta conta, double valorDeposito) {
        conta.saldo = conta.saldo + (valorDeposito * 0.98);
        System.out.println("Saldo da conta após depósito: " + conta.saldo);
    }
}
