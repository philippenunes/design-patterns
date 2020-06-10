package decorator;

/**
 * Padrão de projeto Decorator
 * Ideal para juntar comportamentos quebrados em classes diferentes.
 */
public class TesteDeImpostosComplexos {

    public static void main(String[] args) {
        //Neste caso 'Decoramos' imposto ISS com o importo ICMS.
        Imposto iss = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);

    }
}
