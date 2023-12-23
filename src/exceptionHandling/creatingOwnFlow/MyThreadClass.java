package exceptionHandling.creatingOwnFlow;

public class MyThreadClass {
    MyUncaughtExceptionHandler myUncaughtExceptionHandler = new MyUncaughtExceptionHandlerImpl();
    MyUncaughtExceptionHandler other = null;
    public interface MyUncaughtExceptionHandler{
        public abstract void uncaughtException(Throwable throwable);
    }
    public void dispatchException(Throwable th){

        if (other!=null){
            other.uncaughtException(th);
        }
        else {
            myUncaughtExceptionHandler.uncaughtException(th);
        }
    }
    public void setObject(MyUncaughtExceptionHandler other){
        this.other = other;
    }
}
