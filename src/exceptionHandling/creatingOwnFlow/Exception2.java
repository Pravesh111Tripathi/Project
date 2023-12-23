package exceptionHandling.creatingOwnFlow;

public class Exception2 implements MyThreadClass.MyUncaughtExceptionHandler{
    @Override
    public void uncaughtException(Throwable throwable) {
        System.err.println("ha bhai \nexception aa gya bhai\nkhush ho ja bhai\nok bhai\nbye bhai\nStack Trace dekh le bhai");
        throwable.printStackTrace();
    }
}
