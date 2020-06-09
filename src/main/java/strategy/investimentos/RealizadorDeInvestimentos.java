package strategy.investimentos;

public class RealizadorDeInvestimentos {

    public void realizarInvestimento(Investimento investimento, ContaBancaria contaBancaria) {
        double valorGanho = investimento.calculoInvestimento(contaBancaria);
        contaBancaria.setSaldo(contaBancaria.getSaldo() + valorGanho);
        System.out.println("Saldo atual: " + contaBancaria.getSaldo());
    }
}
