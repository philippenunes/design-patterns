package TemplateMethod;

public class IKCV extends TemplateDeImposto {

    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for(Item item : orcamento.getItens()) {
              if(item.getValor() > 100) return true;
        }
        return false;
    }
}
