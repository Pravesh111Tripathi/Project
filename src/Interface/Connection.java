package Interface;

public interface Connection {
    public abstract java.sql.Connection getConnection();

    public abstract void closeConnection();

}
