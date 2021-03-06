package chainOfResponsability.contabancaria;

public class CSV implements Resposta {

    private Resposta proximo;

    public void responde(Requisicao requisicao, Conta conta) {
        if(requisicao.getFormato().compareTo(Formato.CSV) == 0) {
            System.out.println(";"+conta.getTitular()+";"+conta.getSaldo());
        } else if (proximo != null) {
            proximo.responde(requisicao, conta);
        } else {
            throw new RuntimeException("Formato de resposta não encontrado");
        }
    }

    public void setProximaReposta(Resposta reposta) {
        this.proximo = reposta;
    }
}
