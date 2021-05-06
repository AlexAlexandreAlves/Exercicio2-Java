package DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import Models.Veiculospesados;
import java.sql.Connection;

// 2.2 - Criando o método para cadastrar Veiculos Pesados

public class VeiculoPesadoDAO {

    public static void cadastrarVeiculoPesado(Connection conexao, int idVeiculoPesado, String marca, String modelo,
            int ano, Double valorParaLocacao, String restricoes) throws Exception {

        Connection conn = (Connection) Factory.Conexao.getConnection();
        PreparedStatement stmt = null;

        // Criando a inserção no banco de dados na tabela "veiculo.pesado"

        String cadastroVeiculoPesado = "INSERT INTO contas.veiculopesado"
                + "(idVeiculoPesado, marca, modelo, ano, valorParaLocacao, restricoes)" + "VALUES(?,?,?,?,?,?)";

        try {
            stmt = (PreparedStatement) conn.prepareStatement(cadastroVeiculoPesado);

            stmt.setInt(1, idVeiculoPesado);
            stmt.setString(2, marca);
            stmt.setString(3, marca);
            stmt.setString(4, modelo);
            stmt.setInt(5, ano);
            stmt.setDouble(6, valorParaLocacao);
            stmt.setString(7, restricoes);

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            stmt.close();
        }
    }

    // 5.2 Listando Veiculos Pesados

    public static void listarVeiculoPesados(Connection conexao, int idVeiculoPesado, String marca, String modelo,
            String ano, Double valorParaLocacao, String restricoes) throws Exception {
        String listaVeiculosPesados = "SELECT SUM(*) FROM contas.veiculospesado";
        try {
            PreparedStatement statement = conexao.prepareStatement(listaVeiculosPesados);

            statement.setInt(1, idVeiculoPesado);
            statement.setString(2, marca);
            statement.setString(3, modelo);
            statement.setString(4, ano);
            statement.setDouble(5, valorParaLocacao);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<Veiculospesados> listarVeiculoPesados() {
        return null;
    }
}
