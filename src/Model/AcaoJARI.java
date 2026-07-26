package Model;

public class AcaoJARI extends Acao {

    public AcaoJARI() {
        super(10.99, "JARI", 0.11);
    }

    @Override
    public Double calcularRendimento() {
        return getValor() * getTaxaRendimento();
    }
}