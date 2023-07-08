/*Ques 7)Write a test driver to test the methods.Write a program that prompts user for a positive integer. The program shall read the input as int. and print the "reverse" of the input integer.
	 	For example:
enter a positive integer: 12345 The reverse is: 54321*/
 
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseInteger(number);
        System.out.println("The reverse is: " + reversedNumber);

        scanner.close();
    }

    public static int reverseInteger(int number) {
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}
