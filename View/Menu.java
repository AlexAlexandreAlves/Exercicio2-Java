package View;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;   //Fazendo os imports para trabalhar com as pastas e as classes
import java.sql.SQLException;

public class Menu extends JFrame { // Menu com Interface gráfica (Frontend)


    JLabel sistemaLocacao = new JLabel(" Sistema de Locação de Veiculos ");
    JButton cadastroCliente = new JButton(" 1 - Cadastrar Cliente ");
    JButton cadastroVeiculo = new JButton(" 2 - Cadastrar Veículo   ");
    JButton cadastroLocacao = new JButton(" 3 - Cadastrar Locação ");
    JButton listarCliente = new JButton(" 4 - Listar Clientes ");
    JButton listarVeiculo = new JButton(" 5 - Listar Veículos ");
    JButton listarLocacao = new JButton(" 6 - Listar Locações ");
    JButton sair = new JButton(" Sair ");

    public Menu() {

        // Criando o ActionListener para aguardar a execução

        ActionListener acaoCadastroCliente = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleCadastroCliente(e);
            }
        };

        ActionListener acaoCadastroVeiculo = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleCadastrarVeiculo(e);
            }
        };

        ActionListener acaoCadastroLocacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleCadastrarLocacao(e);
            }
        };

        ActionListener acaoListarCliente = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleListarCliente(e);
            }
        };

        ActionListener acaoListarVeiculo = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handlelistarVeiculo(e);
            }
        };

        ActionListener acaoListarLocacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleListarLocacao(e);
            }
        };

        ActionListener acaoSair = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleSair(e);
            }
        };

        Container pane1 = this.getContentPane();

        // Criando os labels e os butttons para vizualização e utilização da tela

        pane1.setLayout(new FlowLayout());
        pane1.add(sistemaLocacao);
        pane1.add(cadastroCliente);
        pane1.add(cadastroVeiculo);
        pane1.add(cadastroLocacao);
        pane1.add(listarCliente);
        pane1.add(listarVeiculo);
        pane1.add(listarLocacao);
        pane1.add(sair);

        this.setSize(230,280);
        this.setVisible(true);

        cadastroCliente.addActionListener(acaoCadastroCliente);
        cadastroVeiculo.addActionListener(acaoCadastroVeiculo);
        cadastroLocacao.addActionListener(acaoCadastroLocacao);
        listarCliente.addActionListener(acaoListarCliente);
        listarVeiculo.addActionListener(acaoListarVeiculo);
        listarLocacao.addActionListener(acaoListarLocacao);
        sair.addActionListener(acaoSair);
    }

    // Chamando os métodos das classes

    private void handleCadastroCliente(ActionEvent e) {
        new CadastroCliente();
    }

    private void handleCadastrarVeiculo(ActionEvent e) {
        new CadastroVeiculo();

    }

    private void handleCadastrarLocacao(ActionEvent e) {
        new CadastroLocacao();
    }

    private void handleListarCliente(ActionEvent e) {
        new ListarCliente();

    }

    private void handlelistarVeiculo(ActionEvent e) {
        new ListarVeiculo();
    }

    private void handleListarLocacao(ActionEvent e) {
        new ListarVeiculo();
    }

    private void handleSair(ActionEvent e) { // Utilizar na Opção de sair do Menu
        int mensagem = JOptionPane.showConfirmDialog(this, "Deseja sair do menu?", "Sair", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (mensagem == JOptionPane.OK_CANCEL_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) throws SQLException {

    Menu teste = new Menu();

    }
}
