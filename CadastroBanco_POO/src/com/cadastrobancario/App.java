package com.cadastrobancario;

import com.cadastrobancario.controller.CadastroController;
import com.cadastrobancario.view.TelaCadastro;

public class App {
    public static void main(String[] args) {
        TelaCadastro tela = new TelaCadastro();
        new CadastroController(tela);
        tela.setVisible(true);
    }
}