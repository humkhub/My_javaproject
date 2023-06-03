
import java.util.Scanner;

public class ScannerChar {
    public static void main(String[] args) {
        Scanner objChar = new Scanner(System.in);
        System.out.println("Enter any Character ");

        char inputChar = objChar.next().charAt(3);// for character type. there is no method for char// first character of the string and everything starts form o in java
        System.out.println("Enter by User : "+inputChar);
    }

}
