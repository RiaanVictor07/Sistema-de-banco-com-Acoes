package Model;

public abstract class Acao implements Rendavel {
    private Double valor;
    private String nome;
    private Double taxaRendimento;

    public Acao(Double valor, String nome, Double taxaRendimento) {
        this.valor = valor;
        this.nome = nome;
        this.taxaRendimento = taxaRendimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}