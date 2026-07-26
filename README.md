# Sistema Bancário com Ações (JARI/ANVA)

Projeto Java simples desenvolvido para praticar conceitos de Programação Orientada a Objetos: **Herança, Polimorfismo, Interfaces, Encapsulamento (Getters/Setters), Construtores e Arrays**.

## 📋 Descrição

O sistema simula uma conta bancária que permite comprar dois tipos de ações (**JARI** e **ANVA**), cada uma com valor e taxa de rendimento mensal fixos. O usuário pode comprar ações repetidamente até o saldo acabar, recebendo a mensagem de **"Saldo insuficiente"** quando não houver dinheiro suficiente para a próxima compra.

## 🧩 Estrutura do projeto

```
Model/
├── Rendavel.java      → Interface com o contrato de cálculo de rendimento
├── Acao.java           → Classe abstrata com os atributos e comportamentos comuns às ações
├── AcaoJARI.java        → Ação JARI (herda de Acao)
├── AcaoANVA.java        → Ação ANVA (herda de Acao)
└── Conta.java           → Conta bancária: saldo, dados do titular e array de ações compradas

Main.java                → Classe principal, interação com o usuário via console
```

## 💰 Regras de negócio

| Ação | Valor | Rendimento mensal |
|------|-------|--------------------|
| JARI | R$ 10,99 | 0,11 |
| ANVA | R$ 55,67 | 1,20 |

- O usuário pode comprar quantas ações quiser, desde que tenha saldo.
- Se o saldo for insuficiente para a compra, o sistema exibe a mensagem **"Saldo insuficiente"** e não realiza a compra.
- Ao final, o sistema exibe todas as ações compradas, o rendimento mensal de cada uma, o total de rendimento e o saldo atualizado.

## 🎯 Conceitos de POO aplicados

| Conceito | Onde está aplicado |
|----------|---------------------|
| **Interface** | `Rendavel`, que define o contrato `calcularRendimento()` |
| **Herança** | `AcaoJARI` e `AcaoANVA` estendem `Acao` |
| **Polimorfismo** | Cada ação implementa `calcularRendimento()` à sua maneira; o método é chamado de forma genérica através do array `Acao[]` |
| **Encapsulamento** | Atributos privados com getters e setters em `Acao` e `Conta` |
| **Construtores** | Em todas as classes do modelo, inicializando os atributos |
| **Array** | `Acao[] acoesCompradas`, armazenando as ações compradas pela conta |

## ▶️ Como executar

1. Compile todas as classes do projeto.
2. Execute a classe `Main`.
3. Siga as instruções no console:
   - Responda **S** para comprar uma ação ou **N** para encerrar.
   - Ao comprar, escolha entre **JARI** ou **ANVA**.
4. Ao final, o sistema exibe o resumo com as ações compradas, o rendimento total e o saldo.

### Exemplo de execução

```
Deseja comprar uma ação? S/N
S
Qual ação deseja comprar? JARI/ANVA
JARI
Ação JARI comprada com sucesso! Seu saldo agora é: 189.01

Deseja comprar uma ação? S/N
N
Tarefa de ações finalizada!

----- Ações compradas -----
JARI | Valor: 10.99 | Rendimento mensal: 1.21
Total de rendimento mensal: 1.21
Saldo atual: 189.01
Saldo + Rendimento mensal: 190.22
```
<!-->TESTETESTETESTE->
## 🚀 Possíveis melhorias futuras

- Migrar o array `Acao[]` para uma estrutura dinâmica (`ArrayList`) para remover o limite fixo de ações.
- Separar a lógica de negócio (`comprarAcao`) em uma camada de `Service`, mantendo `Conta` apenas como `Model`.
- Persistir os dados da conta em arquivo ou banco de dados através de uma camada de `Repository`.

## 🛠️ Tecnologias

- Java (sem frameworks/bibliotecas externas)

---

**Autor:** Rian
**Projeto de estudo** — Programação Orientada a Objetos em Java
