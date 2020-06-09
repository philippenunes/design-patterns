package chainOfResponsability;

public class TesteDescontos {

    public static void main(String[] args) {
        CalculadorDeDesconto descontos = new CalculadorDeDesconto();

        Orcamento orcamento = new Orcamento(700.0);
        orcamento.adicionarItens(new Item("CANETA", 250.0));
        orcamento.adicionarItens(new Item("LAPIS", 250.0));

        double descontoFinal = descontos.calcula(orcamento);

        System.out.println(descontoFinal);
    }
}
