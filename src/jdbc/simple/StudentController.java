package jdbc.simple;

public class StudentController {
    public static void main(String[] args) {
        StudentBean studentBean = new StudentBean();
        studentBean.setName("sid");
        DAO dao = new StudentDAO();
        dao.save(studentBean);

    }


}
