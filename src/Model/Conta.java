package Model;

public class Conta {
    private int id;
    private String nome;
    private Double saldo;
    private int quantidadeAcoes;
    private Acao[] acoesCompradas;

    public Conta(int id, String nome, Double saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.quantidadeAcoes = 0;
        this.acoesCompradas = new Acao[100];
    }

    public void comprarAcao(Acao acao) {
        if (saldo >= acao.getValor()) {
            saldo = saldo - acao.getValor();
            acoesCompradas[quantidadeAcoes] = acao;
            quantidadeAcoes++;
            System.out.println("Ação " + acao.getNome() + " comprada com sucesso! Seu saldo agora é: " + saldo);
        } else {
            System.out.println("Saldo insuficiente. Deposite mais dinheiro na sua conta para investir.");
        }
    }

    public void exibirAcoesCompradas() {
        System.out.println("----- Ações compradas -----");
        Double totalRendimento = 0.0;

        for (int i = 0; i < quantidadeAcoes; i++) {
            Acao acao = acoesCompradas[i];
            Double rendimento = acao.calcularRendimento();
            totalRendimento += rendimento;

            System.out.printf("%s | Valor: %.2f | Rendimento mensal: %.2f%n",
                    acao.getNome(), acao.getValor(), rendimento);
        }

        System.out.printf("Total de rendimento mensal: %.2f%n", totalRendimento);
        System.out.printf("Saldo atual: %.2f%n", saldo);
        System.out.printf("Saldo + Rendimento mensal: %.2f%n", (saldo + totalRendimento));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}