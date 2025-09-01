# 📘 Sistema de Cadastro Bancário (POO + Java Swing)

Projeto acadêmico para a disciplina de Desenvolvimento de Sistemas, com o objetivo de aplicar os conceitos de **Programação Orientada a Objetos (POO)** e a arquitetura **MVC (Model-View-Controller)** na construção de uma aplicação desktop com **interface gráfica em Java Swing**.

---

## 📜 Descrição

Este projeto é uma aplicação de desktop que simula um **formulário de cadastro bancário**.
A interface gráfica, feita em **Java Swing**, permite inserir e atualizar dados de clientes e suas contas, além de simular uma consulta de cliente já existente.

⚠️ O foco do projeto **não é salvar dados em banco de dados**, mas sim mostrar como organizar o código com POO e MVC.

---

## ✨ Funcionalidades

* Interface gráfica simples e intuitiva para cadastro de clientes.
* Campos para dados pessoais (**Nome, Endereço, Telefone, CPF**).
* Seleção de tipo de conta (**Conta Corrente ou Conta Poupança**).
* Botão **Consultar** que preenche o formulário com dados de exemplo.
* Botão **Atualizar** que grava um novo cliente ou edita um já existente.
* Botão **Fechar** que encerra a aplicação.
* Mensagens de confirmação exibidas em caixas de diálogo.

---

## 🛠️ Tecnologias Utilizadas

* **Java**: Linguagem principal.
* **Java Swing**: Biblioteca para criação da interface gráfica (GUI).

---

## 🧠 Conceitos Aplicados

### Programação Orientada a Objetos (POO)

* **Encapsulamento** → atributos protegidos e acessados apenas por getters e setters.
* **Herança** → `Cliente` herda de `Pessoa`, `ContaCorrente` e `ContaPoupanca` herdam de `Conta`.
* **Polimorfismo** → método `getTipoConta()` se comporta de forma diferente em cada tipo de conta.
* **Abstração** → classes `Pessoa` e `Conta` são abstratas, servindo como molde.

### Arquitetura MVC

* **Model** → classes que representam os dados (Pessoa, Cliente, Conta...).
* **View** → tela gráfica para interação do usuário (`TelaCadastro`).
* **Controller** → faz a ponte entre os dados e a interface (`CadastroController`).

---

## 📂 Estrutura de Arquivos

```bash
CadastroBanco_POO/
├── src/
│   ├── App.java              # Classe principal (inicia a aplicação)
│   ├── CadastroController.java # Controla as ações da tela
│   ├── TelaCadastro.java     # Interface gráfica
│   ├── Pessoa.java           # Classe abstrata base
│   ├── Cliente.java          # Representa o cliente
│   ├── Conta.java            # Classe abstrata base de conta
│   ├── ContaCorrente.java    # Conta Corrente
│   └── ContaPoupanca.java    # Conta Poupança
└── bin/                      # Arquivos compilados (.class)
```

---

👉 Quer que eu deixe esse README em **versão enxuta** (com menos teoria e mais prática) pra parecer mais “feito por aluno”, ou prefere deixar completinho e formal desse jeito?
