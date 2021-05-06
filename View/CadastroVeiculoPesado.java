package View;
import javax.swing.JFrame;
import DAO.VeiculoPesadoDAO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Criação da tela de cadastro de Veiculos pesados utilizando o extends de Jframe

public class CadastroVeiculoPesado extends JFrame {

    public CadastroVeiculoPesado() {

        // Criando os labels e os butttons para vizualização e utilização da tela

        JLabel introSistema = new JLabel(" Cadastramento de Veiculos Pesados ");
        JLabel labelIdVeiculo = new JLabel("Informe o id do veiculo: ");
        JLabel LabelMarcaVeiculo = new JLabel("Marca: ");
        JLabel labelModeloVeiculo = new JLabel("Modelo: ");
        JLabel labelAnoVeiculo = new JLabel("Ano do Veiculo: ");
        JLabel labelRestricoesVeiculo = new JLabel("Informe se o veiculo possui alguma restrição: ");
        JLabel labelValorLocacao = new JLabel("Insira o valor para locação do Veiculo: ");
        JButton confirmacao = new JButton(" Confirmar informações ");

        // Criando os campos de texto

        JTextField textIdVeiculo = new JTextField(25);
        JTextField textMarcaVeiculo = new JTextField(25);
        JTextField textRestricoesVeiculo = new JTextField(25);
        JTextField textModeloVeiculo = new JTextField(25);
        JTextField textAnoVeiculo = new JTextField(25);
        JTextField textValorLocacao = new JTextField(25);

        Container pane = this.getContentPane();

        // Criando o ActionListener para aguardar a execução

        ActionListener acaoconfirmacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handlacaoCadastroLocVeicPesado(e);
            }
        };

        // Adicionando os labels e os butttons para vizualização e utilização da tela

        pane.setLayout(new FlowLayout());

        pane.add(introSistema);

        pane.add(labelIdVeiculo);
        pane.add(textIdVeiculo);

        pane.add(LabelMarcaVeiculo);
        pane.add(textMarcaVeiculo);

        pane.add(labelModeloVeiculo);
        pane.add(textModeloVeiculo);

        pane.add(labelAnoVeiculo);
        pane.add(textAnoVeiculo);

        pane.add(labelValorLocacao);
        pane.add(textValorLocacao);

        pane.add(labelRestricoesVeiculo);
        pane.add(textRestricoesVeiculo);

        pane.add(confirmacao);

        this.setSize(300, 370);
        this.setVisible(true);
    }

    private void handlacaoCadastroLocVeicPesado(ActionEvent e) {
        new VeiculoPesadoDAO();
    }

}
