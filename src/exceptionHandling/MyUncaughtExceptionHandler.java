package exceptionHandling;

public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.err.println("tere baski baat nhi hai baap ko bhej");
        System.err.println("fir bhi stack trace de rha hu ho jaye to kar lena");
        e.printStackTrace();
    }
}
