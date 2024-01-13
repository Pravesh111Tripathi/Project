package exceptionHandling;

import java.io.Closeable;
import java.io.IOException;

public class autoCloseable implements Closeable {
    public autoCloseable(){
        System.out.println(" Print autoClosable");
    }
    @Override
    public void close() {
        System.out.println("resource block closed autoCloseable");
    }
}
