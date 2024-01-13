package jdbc.basic;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        ConnectionUtils connectionUtils = new ConnectionUtils();
        connectionUtils.getConnection();
        Student student = new Student();
        student.getStudents();
    }
}
