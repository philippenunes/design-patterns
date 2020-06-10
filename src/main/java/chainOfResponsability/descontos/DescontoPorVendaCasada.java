package chainOfResponsability.descontos;

import java.util.List;

public class DescontoPorVendaCasada implements Desconto {

    private Desconto proximo;

    public boolean contemItemDeNome(List<Item> itensOrcamento, String nomeDoItem) {
        for (Item item : itensOrcamento) {
            if (item.getNome().equals(nomeDoItem)) {
                return true;
            }
        }
        return false;
    }

    public double desconta(Orcamento orcamento) {
        List<Item> itensOrcamento = orcamento.getItens();
      if(contemItemDeNome(itensOrcamento, "CANETA") && contemItemDeNome(itensOrcamento, "LAPIS")) {
          return orcamento.getValor() * 0.05;
      } else {
          return proximo.desconta(orcamento);
      }
    }

    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
