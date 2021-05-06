package Models;
import java.util.ArrayList;
import DAO.BancoDeDados;

// Criação da Classe Cliente

public class Cliente {
    private int idCliente;
    private String nome;
    private String dtNascimento;
    private String cpf;
    private int diasParaDevolucao;
    private ArrayList<Locacao> qtdLocacoesCliente;

    public static BancoDeDados<Cliente> clientes = new BancoDeDados<>(); // Estabelecendo a conexão com o banco

    // Criando o construtor da classe Cliente

    public Cliente() {
    }

    public Cliente(int idCliente, String nome, String dtNascimento, String cpf, int diasParaDevolucao) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.cpf = cpf;
        this.diasParaDevolucao = diasParaDevolucao;
        this.qtdLocacoesCliente = new ArrayList<>();

        clientes.insertValue(this);

    }
    // Criando os sets

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDtnascimento(String dtnascimento) {
        this.dtNascimento = dtnascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDiasparadevolucao(int diasparadevolucao) {
        this.diasParaDevolucao = diasparadevolucao;
    }

    public void setQtdlocacoescliente(Locacao qtdlocacoescliente) {
        this.qtdLocacoesCliente.add(qtdlocacoescliente);
    }

    // Criando os Gets
    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getDtnascimento() {
        return dtNascimento;
    }

    public String getCpt() {
        return cpf;
    }

    public int getDiasparadevolucao() {
        return diasParaDevolucao;
    }

    public ArrayList<Locacao> getQtdlocacoescliente() {
        return this.qtdLocacoesCliente;
    }

    // Criando o toString para a impressão

    @Override
    public String toString() {
        return "\nId do cliente:" + getIdCliente() + "\nNome do cliente:" + getNome()
                + "\nData de nascimento do cliente: " + getDtnascimento() + "\nCpf do cliente: " + getCpt()
                + "\nDias restantes para a devolução do veiculos: " + getDiasparadevolucao()
                + "\nQuantidade de locações do cliente: " + getQtdlocacoescliente();

    }

    public void QtdeVeiculosLocados(String cpf) { // Aqui seria o
        // Método para apresentar a quantidade de veiculos Locados

        // Fazer chamada do banco de dados somando a quantidade de locações por CPF
        // SELECT SUM(*) FROM contas.locacao WHERE cpf = p1
        // Conexao.qtdLocacaoCliente(conexao, cpf); // Verificar para não enviar a
        // conexão
    }
}
