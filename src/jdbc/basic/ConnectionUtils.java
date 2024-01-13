package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    protected Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pravesh", "root", "root@123");
        return connection;
    }

    protected void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
