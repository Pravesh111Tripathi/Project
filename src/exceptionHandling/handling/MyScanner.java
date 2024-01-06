package exceptionHandling.handling;

import java.io.Closeable;
import java.io.IOException;

public class MyScanner implements Closeable {
    public MyScanner(){
        System.out.println(" MyScanner constructor");
    }


    @Override
    public void close() throws IOException {
        System.out.println(" Myscanner Closed");
    }
}
