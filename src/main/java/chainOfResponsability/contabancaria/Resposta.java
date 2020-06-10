package chainOfResponsability.contabancaria;

public interface Resposta {

    void responde(Requisicao requisicao, Conta conta);
    void setProximaReposta(Resposta reposta);
}
