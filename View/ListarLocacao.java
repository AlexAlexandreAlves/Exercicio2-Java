package View;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

//Criação da tela de Listar Locação utilizando o extends de Jframe

public class ListarLocacao extends JFrame {

    public ListarLocacao() {

        // Criando os labels e os campos de texto para vizualização e utilização da tela

        JLabel introSistema = new JLabel(" Listagem de Locações Cadastradas ");
        JLabel labelListagemLocacoes = new JLabel("Locações:");

        JTextArea textlabelListagemLocacoes = new JTextArea(10, 30);

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        pane.add(introSistema);

        pane.add(labelListagemLocacoes);
        pane.add(textlabelListagemLocacoes);

        this.setSize(250,350);
        this.setVisible(true);
    }

}
