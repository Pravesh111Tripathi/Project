package Interface.markerInterface;

public class Student implements deletable {

    static Student student = new Student();

    public static void main(String[] args) {


        if (student instanceof deletable) {
            System.out.println("allow the class to delete student");

        }
    }
}
