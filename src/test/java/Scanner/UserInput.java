package Scanner;

import java.util.Scanner;
//Problem #9 Write  a Java program that ask the user to input two numbers, performs addition, and displays the result in the console:
//Example: The sum of 10 and 20 is : 30
public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scan.nextInt();

        System.out.println("Enter Second number: ");
        int number2 = scan.nextInt();

        int sum = number1 + number2;

        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        }
    }

