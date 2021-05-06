package Factory;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

// Estabelecendo a conexão com o banco de dados, onde as tabelas foram criadas e os dados inseridos.

public class Conexao {
    public static Connection getConnection() throws SQLException {
        try {

            final String URL = "jdbc:mysql://localhost:3306/contas?useTimezone=true&serverTimezone=UTC";
            final String USER = "root";
            final String PASSWORD = "";

            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
