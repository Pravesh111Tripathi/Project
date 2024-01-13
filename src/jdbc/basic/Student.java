package jdbc.basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student extends ConnectionUtils {
    int id;

    public void saveStudent(Student student) throws Exception {
        Connection connection = getConnection();
        connection.prepareStatement("SELECT * FROM new_table");
        closeConnection(connection);
    }

    public void getStudent(int id) throws Exception {
        Connection connection = getConnection();
        connection.prepareStatement("SELECT * FROM Student where id=" + id);
        closeConnection(connection);
    }

    public void getStudents() throws Exception {
        Connection connection = getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM new_table");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString("id"));
            System.out.print(". ");
            System.out.print(rs.getString("first_name"));
            System.out.print(" ");
            System.out.print(rs.getString("last_name"));
            System.out.print(" (");
            System.out.print(rs.getString("gender"));
            System.out.print(")");
            System.out.println(" ");
        }
        closeConnection(connection);
    }

    public void deleteStudent(int id) throws Exception {
        Connection connection = getConnection();
        PreparedStatement ps = connection.prepareStatement("delete from Student where id=" + id);
        ps.executeUpdate();
        closeConnection(connection);
    }

    public void insertStudent() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter unique id");
        int id = scanner.nextInt();
        System.out.println("enter first name");
        String first_name = scanner.next();
        System.out.println("enter last name");
        String last_name = scanner.next();
        System.out.println("enter gender");
        String gender = scanner.next();
        String sql = "insert into new_table(id,first_name,last_name,gender) values(?,?,?,?)";
        PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, first_name);
        preparedStatement.setString(3, last_name);
        preparedStatement.setString(4, gender);
        preparedStatement.executeUpdate();
    }


}
