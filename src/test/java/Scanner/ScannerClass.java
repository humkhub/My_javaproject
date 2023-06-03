import java.util.Scanner;

public class ScannerClass {
    /* To perform addition on two numbers.
    Scanner class is predefined and onece we import it trasfers all the methods and everything els.
    */
    public static void main(String[] args){
        System.out.println("Enter 1 number");                        // Start frorm mian method and pass a string to use as an inout for user
        Scanner objScan = new Scanner (System.in) ;        // create object to access scanner class. in is an inout stream
        // call method of scanner class with the following built in method for integer data type
        int num1 = objScan.nextInt();                                 // int type method for int class which is stored in num1 which was provided by the user
                                                                      // The output is just enter one number which is input for user
        System.out.println("The First number which is entered by user is "+ num1);
         // no need to create another object for same class. Just resuee the same object
        int num2 = objScan.nextInt();
        System.out.println("The Second number which is entered by user is "+ num2);

        System.out.println("Sum of both numbers is "+ (num1+num2));
        System.out.println("Subtraction of both numbers is "+ (num1-num2));
        System.out.println("Multiplication of both numbers is "+ (num1*num2));
        System.out.println("Divison of both numbers is "+ (num1/num2));
    }


    }


