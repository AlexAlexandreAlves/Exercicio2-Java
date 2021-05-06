package DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import Models.Veiculosleves;
import java.sql.Connection;

// 2.1 - Criando o método para cadastrar Veiculos Pesados

public class VeiculosLeveDAO {

    public static void cadastrarVeiculoLeve(Connection conexao, int idVeiculoLeve, String marca, String modelo, int ano,
            Double valorParaLocacao, String cor) throws Exception {

        Connection conn = (Connection) Factory.Conexao.getConnection();
        PreparedStatement stmt = null;

        // Criando a inserção no banco de dados na tabela "veiculos.leve"

        String cadastroVeiculLeve = "INSERT INTO contas.veiculosleve"
                + "(idVeiculoLeve, marca, modelo, ano, valorParaLocacao, cor)" + "VALUES(?,?,?,?,?,?)";

        try {
            stmt = (PreparedStatement) conn.prepareStatement(cadastroVeiculLeve);

            stmt.setInt(1, idVeiculoLeve);
            stmt.setString(2, marca);
            stmt.setString(3, marca);
            stmt.setString(4, modelo);
            stmt.setInt(5, ano);
            stmt.setDouble(6, valorParaLocacao);
            stmt.setString(7, cor);

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            stmt.close();
        }
    }

    // 5.1 - Listar Veiculos Leves

    public static void listarVeiculosLeves(Connection conexao, int idVeiculoLeve, String marca, String modelo,
            String ano, Double valorParaLocacao, String cor) throws Exception {
        String listaVeiculosLeves = "SELECT SUM(*) FROM contas.veiculosleve";
        try {
            PreparedStatement statement = conexao.prepareStatement(listaVeiculosLeves);

            statement.setInt(1, idVeiculoLeve);
            statement.setString(2, marca);
            statement.setString(3, modelo);
            statement.setString(4, ano);
            statement.setDouble(5, valorParaLocacao);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<Veiculosleves> listarVeiculosLeves() {
        return null;
    }

}
