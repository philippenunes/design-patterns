package TemplateMethod;

public class ICPP extends TemplateDeImposto {

    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }
}
