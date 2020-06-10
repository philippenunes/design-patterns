package chainOfResponsability.contabancaria;

public class RealizaRequisicao {

    public void realizaRequisicao(Requisicao requisicao, Conta conta) {
        Resposta r1 = new XML();
        Resposta r2 = new CSV();
        Resposta r3 = new PORCENTO();

        r1.setProximaReposta(r2);
        r2.setProximaReposta(r3);

        r1.responde(requisicao, conta);

    }
}
