package state.orcamento;

public interface EstadoDeUmOrcamento {

    public void aplicaDescontoExtra(Orcamento orcamento);

    void aprova(Orcamento orcamento);
    void reprova(Orcamento orcamento);
    void finaliza(Orcamento orcamento);

}
