package Controller;

import Model.Acao;
import Model.AcaoANVA;
import Model.AcaoJARI;
import Model.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta(1, "Rian", 200.0);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja comprar uma ação? S/N");
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
                System.out.println("Tarefa de ações finalizada!");
            } else if (resposta.equalsIgnoreCase("S")) {
                System.out.println("Qual ação deseja comprar? JARI/ANVA");
                String tipo = sc.next();

                Acao acao;
                if (tipo.equalsIgnoreCase("JARI")) {
                    acao = new AcaoJARI();
                } else if (tipo.equalsIgnoreCase("ANVA")) {
                    acao = new AcaoANVA();
                } else {
                    System.out.println("Digite apenas JARI ou ANVA");
                    continue;
                }

                conta.comprarAcao(acao);
            } else {
                System.out.println("Digite apenas S ou N");
            }
        }

        conta.exibirAcoesCompradas();
    }
}
