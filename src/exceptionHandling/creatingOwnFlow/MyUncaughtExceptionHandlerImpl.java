package exceptionHandling.creatingOwnFlow;

public class MyUncaughtExceptionHandlerImpl implements MyThreadClass.MyUncaughtExceptionHandler{

    @Override
    public void uncaughtException(Throwable throwable) {
        System.err.println("hello ji");
        System.err.println("you are having an exception");
        throwable.printStackTrace();
    }
}
