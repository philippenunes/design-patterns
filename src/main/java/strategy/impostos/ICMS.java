package strategy.impostos;

import strategy.Imposto;
import strategy.Orcamento;

public class ICMS implements Imposto {

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
