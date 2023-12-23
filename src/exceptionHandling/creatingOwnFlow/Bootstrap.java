package exceptionHandling.creatingOwnFlow;

public class Bootstrap {
    MyThreadClass myThreadClass = new MyThreadClass();
    public void ownFlow(){
        try {
            Integer.parseInt("m1");
        }catch (NumberFormatException numberFormatException){
            myThreadClass.dispatchException(numberFormatException);
        }
    }
    public void ownFlow2(){
        myThreadClass.setObject(new Exception2());
        try {
            Integer.parseInt("m1");
        }catch (NumberFormatException numberFormatException){
            myThreadClass.dispatchException(numberFormatException);
        }
    }

}
