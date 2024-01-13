package exceptionHandling.wrappingOrConversionOfException;

import java.util.Scanner;

public class A {
    public static void method1(){
        try {
            Scanner scanner = new Scanner(System.in);
            int id = Integer.parseInt(scanner.next());
        }catch (Exception exp){
            throw new RuntimeException("provide valid id(it should be integer number)");
        }
    }


    public static void main(String[] args) {
        method1();
    }
}
