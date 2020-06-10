package chainOfResponsability.contabancaria;

public class TestaRequisicaoFormatoConta {

    public static void main(String[] args) {
        Requisicao requisicao = new Requisicao(Formato.XML);
        Conta conta = new Conta("Philippe Nunes", 1000.0);

        RealizaRequisicao realizaRequisicao = new RealizaRequisicao();

        realizaRequisicao.realizaRequisicao(requisicao, conta);
    }
}
