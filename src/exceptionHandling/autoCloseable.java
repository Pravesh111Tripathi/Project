package exceptionHandling;

import java.io.Closeable;
import java.io.IOException;

public class autoCloseable implements Closeable {
    @Override
    public void close() {
        System.out.println("hello ji I am finally");
    }
}
