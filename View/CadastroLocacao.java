package View;
import javax.swing.JFrame;
import DAO.LocacaoDAO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Criação da tela de cadastro de Locação utilizando o extends de Jframe

public class CadastroLocacao extends JFrame {

    public CadastroLocacao() {

        // Criando os labels e os butttons para vizualização e utilização da tela

        JLabel introSistema = new JLabel(" Cadastramento de Locações ");
        JLabel labelIdLocacao = new JLabel("Informe o id da Locação: ");
        JLabel labelIdCliente = new JLabel("Informe o id do cliente: ");
        JLabel labelDtLocacao = new JLabel("Data de locação do veiculo: ");
        JLabel labelDtDevolucao = new JLabel("Data para devolução do Veiculo: ");
        JButton confirmacao = new JButton(" Confirmar informações ");

        // Criando os campos de texto

        JTextField textIdLocacao = new JTextField(25);
        JTextField textIdCliente = new JTextField(25);
        JTextField textDtLocacao = new JTextField(25);
        JTextField textDtDevolucao = new JTextField(25);

        Container pane = this.getContentPane();

        // Criando o ActionListener para aguardar a execução

        ActionListener acaoconfirmacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleConfirmacao(e);
            }
        };

        pane.setLayout(new FlowLayout());

        pane.add(introSistema);
        pane.add(labelIdLocacao);
        pane.add(textIdLocacao);

        pane.add(labelIdCliente);
        pane.add(textIdCliente);

        pane.add(labelDtLocacao);
        pane.add(textDtLocacao);

        pane.add(labelDtDevolucao);
        pane.add(textDtDevolucao);

        pane.add(confirmacao);

        this.setSize(300, 340);
        this.setVisible(true);
    }
    // Adicionando as informações da tela no banco de dados

    private void handleConfirmacao(ActionEvent e) {

        new LocacaoDAO();

    }

}
