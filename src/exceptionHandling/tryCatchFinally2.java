package exceptionHandling;

import java.util.Scanner;

public class tryCatchFinally2 {
    public static void demo(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(Integer.parseInt(scanner.next()));
        } catch (NumberFormatException exception) {
            System.out.println("only Integer values are allowed");
        }
    }

    public static void main(String[] args) {
        demo();
    }
}
