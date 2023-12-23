package exceptionHandling;

public class CheckedExceptionCheck {
    public static void main(String[] args) {

    }
    public static void m1() {
        try {
            throw new CheckedException();
        } catch (CheckedException e) {
            throw new RuntimeException(e);
        }
    }
}
