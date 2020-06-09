package strategy.investimentos;

public class Conservador implements Investimento {

    public double calculoInvestimento(ContaBancaria contaBancaria) {
        return contaBancaria.getSaldo() * 0.08;
    }
}
