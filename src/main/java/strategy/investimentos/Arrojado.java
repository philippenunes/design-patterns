package strategy.investimentos;

public class Arrojado implements Investimento {

    public double calculoInvestimento(ContaBancaria contaBancaria) {
        double d = Math.random();
        if (d < 0.5) {
            return contaBancaria.getSaldo() * 0.06; //50% de chance
        } else if (d < 0.7) {
            return contaBancaria.getSaldo() * 0.05; //20% de chance
        } else {
            return contaBancaria.getSaldo() * 0.03; //30% de chance
        }
    }
}
