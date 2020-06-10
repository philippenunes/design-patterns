package state.contabancaria;

public interface EstadoContaBancaria {

    public void saque(Conta conta, double valorSaque);
    public void deposito(Conta conta, double valorDeposito);



}
