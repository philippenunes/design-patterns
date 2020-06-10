package state.contabancaria;

/**
 * Pardão de projeto State
 * Utilizado quando há a necessidade de implementar uma máquina de estados.
 */
public class TestaContaBancaria {

    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.deposita(100);
    }
}
