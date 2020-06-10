package state.contabancaria;

public class Conta {

    protected double saldo;
    protected EstadoContaBancaria estado;

    public Conta(){
        estado = new SaldoPositivo();
    }

    public void saca(double valor) {
        estado.saque(this, valor);
    }

    public void deposita(double valor) {
        estado.deposito(this, valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
