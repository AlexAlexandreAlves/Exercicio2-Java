package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;

import Models.Locacao;

//// 3.0 - Criando o método para cadastrar Locação

public class LocacaoDAO {

    public static void cadastrarLocacoes(Connection conexao, int idDaLocacao, int idDocliente, Date dtLocacao,
            Date dtDevolucao) throws Exception {

        Connection conn = (Connection) Factory.Conexao.getConnection();
        PreparedStatement stmt = null;

          //Criando a inserção no banco de dados na tabela "locacao"

        String Cadastrolocacoes = "INSERT INTO contas.locacao " + "(idDaLocacao, idDocliente, idLocacao, dtDevolucao)"
                + "VALUES(?,?,?,?)";
        try {
            stmt = (PreparedStatement) conn.prepareStatement(Cadastrolocacoes);
            stmt.setInt(1, idDaLocacao);
            stmt.setInt(2, idDocliente);
            stmt.setDate(3, (java.sql.Date) dtLocacao);
            stmt.setDate(4, (java.sql.Date) dtDevolucao);

            stmt.executeUpdate();

        

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            stmt.close();
        }
    }

    // 6.0 - Listando as locações dos veiculos

    public static void listarLocacoes(Connection conexao, int idDaLocacao, int idDocliente, Date dtLocacao,
            Date dtDevolucao) throws Exception {
        String listaLocacoes = "SELECT SUM(*) FROM contas.locacao";
        try {
            PreparedStatement statement = conexao.prepareStatement(listaLocacoes);

            statement.setInt(1, idDaLocacao);
            statement.setInt(2, idDocliente);
            statement.setDate(3, (java.sql.Date) dtLocacao);
            statement.setDate(4, (java.sql.Date) dtDevolucao);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

	public static ArrayList<Locacao> listarLocacoes() {
		return null;
	}
}
