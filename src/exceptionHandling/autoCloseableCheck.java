package exceptionHandling;

import java.util.Scanner;
public class autoCloseableCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try(autoCloseable autoCloseable = new autoCloseable()) {
            System.out.println(Integer.parseInt(scanner.next()));
        } catch (NumberFormatException e) {
            System.out.println("catch is here");
        }
    }
}
