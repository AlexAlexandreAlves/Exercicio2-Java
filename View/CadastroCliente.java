package View;
import javax.swing.JFrame;
import DAO.ClienteDAO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Criação da tela de cadastro de cliente utilizando o extends de Jframe

public class CadastroCliente extends JFrame {

    public CadastroCliente() {

        // Criando os labels e os butttons para vizualização e utilização da tela

        JLabel introSistema = new JLabel(" Cadastramento de Cliente ");
        JLabel labelId = new JLabel("Informe o id do cliente: ");
        JLabel labelNomeCliente = new JLabel("Nome completo: ");
        JLabel labelDtNascimento = new JLabel("Data de nascimento: ");
        JLabel labelCpfCliente = new JLabel("Cpf: ");
        JLabel labelDtDevolucao = new JLabel("Informe a data para devolução do veiculo: ");
        JButton confirmacao = new JButton(" Confirmar informações ");

        // Criando os campos de texto

        JTextField textId = new JTextField(25);
        JTextField textNomeCliente = new JTextField(25);
        JTextField textDtNascimento = new JTextField(25);
        JTextField textCpfCliente = new JTextField(25);
        JTextField textDtDevolucao = new JTextField(25);

        Container pane = this.getContentPane();

        // Criando o ActionListener para aguardar a execução

        ActionListener acaoconfirmacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleConfirmacao(e);
            }
        };

        pane.setLayout(new FlowLayout());

        // Adicionando os labels e os butttons para vizualização e utilização da tela

        confirmacao.addActionListener(acaoconfirmacao);

        pane.add(introSistema);
        pane.add(labelId);
        pane.add(textId);

        pane.add(labelNomeCliente);
        pane.add(textNomeCliente);

        pane.add(labelDtNascimento);
        pane.add(textDtNascimento);

        pane.add(labelCpfCliente);
        pane.add(textCpfCliente);

        pane.add(labelDtDevolucao);
        pane.add(textDtDevolucao);
        pane.add(confirmacao);

        this.setSize(300,340);
        this.setVisible(true);

    }

    // Adicionando as informações da tela no banco de dados

    private void handleConfirmacao(ActionEvent e) {

        new ClienteDAO();

    }
public static void main(String[] args) {
    CadastroCliente teste = new CadastroCliente();
}
  
}
