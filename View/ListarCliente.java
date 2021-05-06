package View;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

//Criação da tela de Listar Clientes utilizando o extends de Jframe

public class ListarCliente extends JFrame {

    public ListarCliente() {

        // Criando os labels e os campos de texto para vizualização e utilização da tela

        JLabel introSistema = new JLabel(" Listagem de Clientes Cadastrados ");
        JLabel labelListagemCliente = new JLabel("Clientes:");

        JTextArea textlabelListagemCliente = new JTextArea(10, 30);

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        pane.add(introSistema);

        pane.add(labelListagemCliente);
        pane.add(textlabelListagemCliente);

        this.setSize(250,350);
        this.setVisible(true);
    }

}
