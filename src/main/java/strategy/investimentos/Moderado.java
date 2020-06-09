package strategy.investimentos;

import java.util.Random;

public class Moderado implements Investimento {

    public double calculoInvestimento(ContaBancaria contaBancaria) {
        boolean random = new Random().nextBoolean();
        if(random) {
            return contaBancaria.getSaldo() * 0.25; //50% de chance
        } else {
            return contaBancaria.getSaldo() * 0.50; //50% de chance
        }
    }
}
