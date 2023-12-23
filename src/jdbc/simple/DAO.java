package jdbc.simple;

public abstract class DAO {

    public abstract void save(Object object);

    public abstract void update(Object object);

    public abstract void delete(Object object);

}
