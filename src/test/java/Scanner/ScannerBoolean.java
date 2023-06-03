package Scanner;

import java.util.Scanner;

public class ScannerBoolean {
    public static void main(String[] args) {
        Scanner scanBol = new Scanner(System.in);
        System.out.println(" Do you have a passport? ");
        boolean inputBol = scanBol.nextBoolean();

        if ( inputBol ) {
            System.out.println("You can take this flight");      // will work only if pass true
        }
else {
            System.out.println("You must stay home");
        }

    }
}
