import java.util.Scanner;

public class BananaProg2 { // using scanner class while in other we use for loop

    public static void main(String[] args) {
        System.out.println("Enter any String");
        Scanner objBan = new Scanner(System.in);
        String inputBan = objBan.next();

        int matchingCounter = 0;     // take one variable int is used to increase the matching count

        for(int i=0; i< inputBan.length(); i++){           // for loop to iterate this string...indexing start form zero in memor

            if (inputBan.charAt(i)  == 'a' ){              // condition if inputBan string from user, charat method it will return the chracter whatevr we pass here
              matchingCounter++;
            }
        }
        System.out.println("Total Number of Matching Character are " + matchingCounter);

    }
}