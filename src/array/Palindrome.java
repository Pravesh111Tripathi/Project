package array;

import java.util.Scanner;

public class Palindrome {

    public void palindrome(int number) {
        int reverse = 0;
        int temp = number;
        while (temp > 0) {
            int value = temp % 10;
            reverse = (reverse * 10) + value;
            temp = temp / 10;
        }
        if (number == reverse) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
        System.out.println(reverse);
    }

}
