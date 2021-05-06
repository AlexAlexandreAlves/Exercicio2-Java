package View;
import javax.swing.JFrame;
import DAO.VeiculoPesadoDAO;
import DAO.VeiculosLeveDAO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Criação da tela de cadastro de veiculo utilizando o extends de Jframe

public class CadastroVeiculo extends JFrame {

    public CadastroVeiculo() {

        // Criando os labels e os butttons para vizualização e utilização da tela

        JLabel introSistema = new JLabel(" Cadastramento de Veiculos ");
        JLabel labelTipoVeiculo = new JLabel("Informe o tipo de veiculo: ");
        JButton veiculoLeve = new JButton(" 1 - Veículo Leve   ");
        JButton veiculoPesado = new JButton(" 2 - Veiculo Pesado  ");

        // Criando o ActionListener para aguardar a execução

        ActionListener acaoCadastroLocacaoVeiculoLeve = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handlacaoCadastroLocVeicLeve(e);
            }
        };

        ActionListener acaoCadastroLocacaoVeiculoPesado = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleacaoCadastroLocaVeicPesado(e);
            }
        };

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        // Adicionando os labels e os butttons para vizualização e utilização da tela

        pane.add(introSistema);
        pane.add(labelTipoVeiculo);
        pane.add(veiculoLeve);
        pane.add(veiculoPesado);

        veiculoLeve.addActionListener(acaoCadastroLocacaoVeiculoLeve);
        veiculoPesado.addActionListener(acaoCadastroLocacaoVeiculoPesado);

        this.setSize(300,340);
        this.setVisible(true);

    }

    private void handlacaoCadastroLocVeicLeve(ActionEvent e) {
        new VeiculosLeveDAO();
    }

    private void handleacaoCadastroLocaVeicPesado(ActionEvent e) {
        new VeiculoPesadoDAO();
    }

}
