package strategy.investimentos;

public class TestaInvestimento {

    public static void main(String[] args) {
        Investimento conservador = new Conservador();
        Investimento moderado = new Moderado();
        Investimento arrojado = new Arrojado();
        ContaBancaria contaBancaria = new ContaBancaria();
        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

//        realizadorDeInvestimentos.realizarInvestimento(conservador, contaBancaria);
        realizadorDeInvestimentos.realizarInvestimento(moderado, contaBancaria);
//        realizadorDeInvestimentos.realizarInvestimento(arrojado, contaBancaria);
    }
}
