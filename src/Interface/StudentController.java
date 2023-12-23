package Interface;

public class StudentController {
    public static void main(String[] args) {
        StudentBean studentBean = new StudentBean();
        DAO dao = new StudentDAO();
        dao.save(studentBean);


    }

}
