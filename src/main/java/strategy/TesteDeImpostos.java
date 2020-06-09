package strategy;

import strategy.impostos.ICMS;
import strategy.impostos.ISS;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto icms = new ICMS();
        Imposto iss = new ISS();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        calculadorDeImpostos.realizaCalculo(orcamento, icms);
        calculadorDeImpostos.realizaCalculo(orcamento, iss);

    }
}
