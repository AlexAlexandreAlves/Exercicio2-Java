package View;
import javax.swing.JFrame;
import DAO.VeiculosLeveDAO;
import Models.Veiculosleves;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Criação da tela de cadastro de Veiculos leve utilizando o extends de Jframe

public class CadastroVeiculoLeve extends JFrame {

    public CadastroVeiculoLeve() {

        // Criando os labels e os butttons para vizualização e utilização da tela

        JLabel introSistema = new JLabel(" Cadastramento de Veiculos Leves ");
        JLabel labelIdVeiculo = new JLabel("Informe o id do veiculo: ");
        JLabel LabelMarcaVeiculo = new JLabel("Marca: ");
        JLabel labelCorVeiculo = new JLabel("Cor: ");
        JLabel labelModeloVeiculo = new JLabel("Modelo: ");
        JLabel labelAnoVeiculo = new JLabel("Ano do veiculo: ");
        JLabel labelValorLocacao = new JLabel("Insira o valor para locação do Veiculo: ");
        JButton confirmacao = new JButton(" Confirmar informações ");

        // Criando os campos de texto

        JTextField textIdVeiculo = new JTextField(25);
        JTextField textMarcaVeiculo = new JTextField(25);
        JTextField textCorVeiculo = new JTextField(25);
        JTextField textModeloVeiculo = new JTextField(25);
        JTextField textAnoVeiculo = new JTextField(25);
        JTextField textValorLocacao = new JTextField(25);

        Container pane = this.getContentPane();

        // Criando o ActionListener para aguardar a execução

        ActionListener acaoconfirmacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handlacaoCadastroLocVeicLeve(e);
            }
        };

        // Adicionando os labels e os butttons para vizualização e utilização da tela

        pane.setLayout(new FlowLayout());

        pane.add(introSistema);

        pane.add(labelIdVeiculo);
        pane.add(textIdVeiculo);

        pane.add(LabelMarcaVeiculo);
        pane.add(textMarcaVeiculo);

        pane.add(labelCorVeiculo);
        pane.add(textCorVeiculo);

        pane.add(labelModeloVeiculo);
        pane.add(textModeloVeiculo);

        pane.add(labelAnoVeiculo);
        pane.add(textAnoVeiculo);

        pane.add(labelValorLocacao);
        pane.add(textValorLocacao);

        pane.add(confirmacao);

        this.setSize(300, 370);
        this.setVisible(true);
    }

    private void handlacaoCadastroLocVeicLeve(ActionEvent e) {
        new VeiculosLeveDAO();
    }

}
