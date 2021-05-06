package Models;
import java.util.ArrayList;
import DAO.BancoDeDados;

//Criando a classe de veiculos pesados herdando os atributos e propriedades de veiculo utilizando o "extends"

public class Veiculospesados extends Veiculo {
    private int idVeiculoPesado;
    private String restricoes;
    private ArrayList<Veiculoslocados> veiculosPesadosLoc;

    public static BancoDeDados<Veiculospesados> bdVeicPesados = new BancoDeDados<>();

    // Criando o construtor da classe

    public Veiculospesados(int idVeiculoPesado, String restricoes, String marca, String modelo, int ano,
            double valorParaLocacao) {
        super(marca, modelo, ano, valorParaLocacao);
        this.idVeiculoPesado = idVeiculoPesado;
        this.restricoes = restricoes;
        this.veiculosPesadosLoc = new ArrayList<>();

        bdVeicPesados.insertValue(this);

    }

    // Criando os Sets
    public void setIdVeiculoPesado(int idVeiculoPesado) {
        this.idVeiculoPesado = idVeiculoPesado;
    }

    public void setRestricoes(String restricoes) {
        this.restricoes = restricoes;
    }

    public void setveiculosPesadosLoc(Veiculoslocados veiculosPesadosLoc) {
        this.veiculosPesadosLoc.add(veiculosPesadosLoc);
    }

    // Criando os Gets
    public int getIdVeiculoPesado() {
        return idVeiculoPesado;
    }

    public String getRestricoes() {
        return restricoes;
    }

    public ArrayList<Veiculoslocados> getveiculosPesadosLoc() {
        return this.veiculosPesadosLoc;
    }

    public static Veiculospesados getVeiculo(int id) throws Exception {
        return bdVeicPesados.getValor(id);
    }

    // Criando o toString para a impressão

    @Override
    public String toString() {
        return "\nId do Veiculo Pesado:" + getIdVeiculoPesado() + "\nPossiveis Restrições: " + getRestricoes();

    }
}
