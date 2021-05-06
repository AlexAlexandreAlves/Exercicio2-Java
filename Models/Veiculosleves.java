package Models;
import java.util.ArrayList;
import DAO.BancoDeDados;

//Criando a classe de veiculos leves herdando os atributos e propriedades de veiculo utilizando o "extends"

public class Veiculosleves extends Veiculo {
    private int idVeiculoLeve;
    private String cor;
    private ArrayList<Veiculoslocados> locacaoVeiculosLeves; // Utilizando o ArrayList para fazer o relacionamento com a
                                                             // classe de veiculos locados

    public static BancoDeDados<Veiculosleves> bdVeicLeves = new BancoDeDados<>(); // Estabelecendo a conexão com banco
                                                                                  // de dados

    // Criando o construtor da classe

    public Veiculosleves(int idVeiculoLeve, String cor, String marca, String modelo, int ano, double valorParaLocacao) {
        super(marca, modelo, ano, valorParaLocacao);
        this.idVeiculoLeve = idVeiculoLeve;
        this.cor = cor;
        this.locacaoVeiculosLeves = new ArrayList<>();

        bdVeicLeves.insertValue(this);
    }

    // Criando os Sets
    public void setIdVeiculoLeve(int idVeiculoLeve) {
        this.idVeiculoLeve = idVeiculoLeve;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setLocacaoVeiculosLeves(Veiculoslocados locacaoVeiculosLeves) {
        this.locacaoVeiculosLeves.add(locacaoVeiculosLeves);
    }

    // Criando os Gets
    public int getIdVeiculoLeve() {
        return idVeiculoLeve;
    }

    public String getCor() {
        return cor;
    }

    public ArrayList<Veiculoslocados> getLocacaoVeiculosLeves() {
        return this.locacaoVeiculosLeves;
    }

    public static Veiculosleves getVeiculo(int id) throws Exception {
        return bdVeicLeves.getValor(id);
    }

    // Criando o toString para a impressão

    @Override
    public String toString() {
        return "\nId Veiculo categoria Leve:" + getIdVeiculoLeve() + "\nCor de Veiculo: " + getCor();

    }

}
