package Scanner;

import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {

        Scanner stringObj = new Scanner(System.in);
        System.out.println("Enter your name? ");

        String stringV = stringObj.next();// for Stirng....> this next() wait for the user input one by one at one time
        System.out.println("Hello!! "+ stringV);

        System.out.println("Enter second person name ");
        String stringV2 = stringObj.nextLine(); //for Strin....> nextLine() takes two or  inputs in single line at one time
        System.out.println("Hello!! "+stringV2);

    }
}