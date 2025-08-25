package com.cadastrobancario.view;
import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends JFrame {
    private JLabel jlAgencia, jlConta, jlNome, jlEndereco, jlTelefone, jlCpf;
    private JTextField jtfAgencia, jtfConta, jtfNome, jtfEndereco, jtfTelefone, jtfCpf;
    private JSeparator jSeparator01, jSeparator02;
    private JRadioButton jrbCorrente, jrbPoupanca;
    private ButtonGroup bgContas;
    private JButton jbConsultar, jbAtualizar, jbFechar;

    public TelaCadastro() {
        setSize(400, 255);
        setTitle("Java Swing - Desenvolvimento de Sistemas");
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centralizar();

        jlAgencia = new JLabel("Código da Agência");
        jlAgencia.setBounds(10, 10, 110, 18);
        getContentPane().add(jlAgencia);

        jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125, 10, 50, 20);
        getContentPane().add(jtfAgencia);

        jlConta = new JLabel("Número da Conta");
        jlConta.setBounds(205, 10, 105, 18);
        getContentPane().add(jlConta);

        jtfConta = new JTextField();
        jtfConta.setBounds(315, 10, 60, 20);
        getContentPane().add(jtfConta);

        jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        getContentPane().add(jSeparator01);

        jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlNome);

        jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
        getContentPane().add(jtfNome);

        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlEndereco);

        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        getContentPane().add(jtfEndereco);

        jlTelefone = new JLabel("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlTelefone);

        jtfTelefone = new JTextField();
        jtfTelefone.setBounds(75, 100, 300, 20);
        getContentPane().add(jtfTelefone);

        jlCpf = new JLabel("CPF:");
        jlCpf.setBounds(10, 125, 60, 18);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlCpf);

        jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 125, 300, 20);
        getContentPane().add(jtfCpf);
        
        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic('C'); 
        jrbCorrente.setSelected(true);
        getContentPane().add(jrbCorrente);

        jrbPoupanca = new JRadioButton("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic('P'); 
        getContentPane().add(jrbPoupanca);

        bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        getContentPane().add(jSeparator02);

        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic('S'); 
        getContentPane().add(jbConsultar);

        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic('A'); 
        jbAtualizar.setEnabled(false); 
        getContentPane().add(jbAtualizar);

        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic('F'); 
        getContentPane().add(jbFechar);
    }
    
    private void centralizar() {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        setLocation((tela.width - janela.width) / 2, (tela.height - janela.height) / 2);
    }

    public JTextField getJtfAgencia() { return jtfAgencia; }
    public JTextField getJtfConta() { return jtfConta; }
    public JTextField getJtfNome() { return jtfNome; }
    public JTextField getJtfEndereco() { return jtfEndereco; }
    public JTextField getJtfTelefone() { return jtfTelefone; }
    public JTextField getJtfCpf() { return jtfCpf; }
    public JRadioButton getJrbCorrente() { return jrbCorrente; }
    public JButton getJbConsultar() { return jbConsultar; }
    public JButton getJbAtualizar() { return jbAtualizar; }
    public JButton getJbFechar() { return jbFechar; }
}