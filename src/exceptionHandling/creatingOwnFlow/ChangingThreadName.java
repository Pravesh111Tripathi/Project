package exceptionHandling.creatingOwnFlow;

public class ChangingThreadName {
    public static void method2() {
        Thread thread = Thread.currentThread();
        thread.setName("yeah! boi!");
        method1();
    }

    public static void method1() {
        Integer.parseInt("hello");
    }

    public static class ExceptionClass {
        public static void method() {
            throw new RuntimeException("number");

        }
    }

    public static class ImplementingThrowable extends Throwable {

    }
}
