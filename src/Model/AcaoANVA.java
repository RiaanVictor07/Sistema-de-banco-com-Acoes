package Model;
//teste

public class AcaoANVA extends Acao {

    public AcaoANVA() {
        super(55.67, "ANVA", 1.20);
    }

    @Override
    public Double calcularRendimento() {
        return getValor() * getTaxaRendimento();
    }
}
