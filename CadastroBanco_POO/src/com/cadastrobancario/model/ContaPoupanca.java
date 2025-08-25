package com.cadastrobancario.model;

public class ContaPoupanca extends Conta {
    @Override
    public String getTipoConta() {
        return "Conta Poupança";
    }
}