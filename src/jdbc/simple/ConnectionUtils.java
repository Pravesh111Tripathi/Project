package jdbc.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionUtils extends DAO {
    public abstract Connection getConnection();

    public abstract void closeConnection();
}
