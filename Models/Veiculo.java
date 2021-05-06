package Models;

//Criação da Classe Veiculo como abstrata que não pode ser instanciada mas que serve para que 
//Veiculo Leve e Veiculo Pesado herdem seus atributos e propriedades

public abstract class Veiculo {
    
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double valorParaLocacao;

    // Criando o construtor da classe veiculo

    public Veiculo(String marca, String modelo, int ano, double valorParaLocacao) { // Criando os construtores
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorParaLocacao = valorParaLocacao;

    }

    // Criando os Sets
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValorParaLocacao(double valorParaLocacao) {
        this.valorParaLocacao = valorParaLocacao;
    }

    // Criando os Gets
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getValorParaLocacao() {
        return valorParaLocacao;
    }

    // Criando o toString para a impressão

    @Override
    public String toString() {
        return "\nMarca do Veiculo:" + getMarca() + "\nModelo do Veiculo: " + getModelo() + "\nAno do Veiculo: "
                + getAno() + "\nValor para locação do Veiculo: " + getValorParaLocacao();

    }
}
