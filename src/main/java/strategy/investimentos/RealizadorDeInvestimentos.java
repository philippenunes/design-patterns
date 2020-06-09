package strategy.investimentos;

public class RealizadorDeInvestimentos {

    public void realizarInvestimento(Investimento investimento, ContaBancaria contaBancaria) {
        double valorGanho = investimento.calculoInvestimento(contaBancaria);
        contaBancaria.deposita(valorGanho * 0.75);
        System.out.println("Saldo atual: " + contaBancaria.getSaldo());
    }
}
