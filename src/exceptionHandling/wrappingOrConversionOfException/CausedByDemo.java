package exceptionHandling.wrappingOrConversionOfException;


import java.util.Scanner;

public class CausedByDemo {
    public static void demo() throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("enter integer numbers");
            System.out.println(Integer.parseInt(scanner.next()));
        }catch (NumberFormatException ex){
            throw new IllegalArgumentException("please provide a valid number",ex);
        }
    }

    public static void main(String[] args) {
        try {
            demo();
        }catch(IllegalArgumentException exception){
           System.out.println(exception.getMessage());
            Throwable throwable = exception.getCause();
            throwable.printStackTrace();
            System.err.println(throwable.getClass().getName());


        }

    }
}
