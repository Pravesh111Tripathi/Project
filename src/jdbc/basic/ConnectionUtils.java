package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    protected Connection getConnection() throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pravesh", "root", "#@Gayatri123");
        return connection;
    }

    protected void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
