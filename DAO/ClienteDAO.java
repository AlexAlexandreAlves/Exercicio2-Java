package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;


// 1.0 - Criando o método para cadastrar Cliente

public class ClienteDAO {

    public static void cadastrarCliente(Connection conexao, int idCliente, String nome, String dtNascimento,
            String cpf, int diasParaDevolucao) throws Exception {

                Connection conn = (Connection) Factory.Conexao.getConnection();
                PreparedStatement stmt = null;

        //Criando a inserção no banco de dados na tabela "cliente"

        String cadastroCliente = "INSERT INTO contas.cliente (idCliente, nome, dtnascimento, cpf, diasparadevolucao) VALUES(?,?,?,?,?);";
        
            try {
                stmt = (PreparedStatement) conn.prepareStatement(cadastroCliente);
                
                stmt.setInt(1, idCliente);
                stmt.setString(2, nome);
                stmt.setString(3, dtNascimento);
                stmt.setString(4, cpf);
                stmt.setInt(5, diasParaDevolucao);
                
    
                stmt.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            stmt.close();
        }
    }
    

    // Método para Listar os Clientes

    public static ArrayList<Models.Cliente> listarTodosClientes() throws SQLException {
        Connection conn = (Connection) Factory.Conexao.getConnection();

        String sql = "SELECT * FROM cliente";
        // ========= Método que faz a conexão =========
        PreparedStatement stmt = conn.prepareStatement(sql);

        // ========= Executar o select =========
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String dtnascimento = rs.getString("dtnascimento");
            String cpf = rs.getString("cpf");
            String diasparadevolucao = rs.getString("diasparadevolucao");

            System.out.println("Id :" + id + "\n" + "Nome :" + nome + "\n" + "dtnascimento :" + dtnascimento + "\n"
                    + "Cpf :" + cpf + "\n" + "Telefone :" + diasparadevolucao + "\n");
        }

        stmt.close();
        conn.close();
        return null;
    }

    // 4.0 Listando a quantidade de locações por cliente

    public static void qtdLocacaoCliente(Connection conexao, String cpf) throws Exception {
        String locacoesPorCliente = "SELECT SUM(*) FROM contas.locacao WHERE cpf = ?";
        try {
            PreparedStatement statement = conexao.prepareStatement(locacoesPorCliente);

            statement.setString(1, cpf);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
