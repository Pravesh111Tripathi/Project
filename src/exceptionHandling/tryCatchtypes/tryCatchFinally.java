package exceptionHandling.tryCatchtypes;

import java.util.Scanner;

public class tryCatchFinally {
    public static void demo(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(Integer.parseInt(scanner.next()));
        }catch (NumberFormatException exception){
            System.out.println("only Integer values are allowed");
        }finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        demo();
    }
}
