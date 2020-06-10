package chainOfResponsability.descontos;

public interface Desconto {

    double desconta(Orcamento orcamento);
    void setProximo(Desconto desconto);
}
