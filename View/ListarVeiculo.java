package View;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class ListarVeiculo extends JFrame {

    // Criação da tela de Listar Veiculos utilizando o extends de Jframe

    public ListarVeiculo() {

        // Criando os labels e os campos de texto para vizualização e utilização da tela

        JLabel introSistema = new JLabel(" Listagem de Veiculos Cadastrados ");
        JLabel labelListagemVeiculos = new JLabel("Veiculos:");

        JTextArea textlabelListagemVeiculos = new JTextArea(10, 30);

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        pane.add(introSistema);

        pane.add(labelListagemVeiculos);
        pane.add(textlabelListagemVeiculos);

        this.setSize(250,350);
        this.setVisible(true);
    }

}
