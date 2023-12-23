package jdbc.simple;

import java.sql.Connection;

public abstract class MySQL extends ConnectionUtils {
    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void closeConnection() {

    }
}
