package chainOfResponsability.contabancaria;

public class XML implements Resposta {

    private Resposta proximo;

    public void responde(Requisicao requisicao, Conta conta) {
        if(requisicao.getFormato().compareTo(Formato.XML) == 0) {
            System.out.println("<titular>"+conta.getTitular()+"</titular><saldo>"+conta.getSaldo()+"</saldo>");
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
