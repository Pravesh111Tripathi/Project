package exceptionHandling.handling;

public class HandlingExceptionInParseInt {
    public static void method2() {
        Thread thread = Thread.currentThread();
        thread.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        method1();
    }

    public static void method1() {
        Integer.parseInt("hello");
    }
}
