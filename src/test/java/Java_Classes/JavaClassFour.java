public class JavaClassFour {
    /* Review
    What is static and non static variables?

     */

    // Creating a static variable under class ----> Global variable (declared inside class scope and varibale can be called anywhere inside the class)
    public static int phoneNum = 12245;      //    variable declaration = intitialization or definition

   // Creating a non static variable under class ----> Also a Global variable (declared inside class scope)
   public int age = 30;                       // INSTANCE VARIABLE = NON STATIC

   // Creating a static method
    public static void printValue() {
        // Creating local variable inside this method like abc ---> can not be used outside printValue() method

        String abc = "Hello";                             // local variable and CAN NOT BE DEFINED WITH STATIC KEYWORD HERE
        System.out.println(abc + " This is review");// System is final class and is restricted class, concatinate + operator



    }
    public static void main(String[] args) {
        // Call methods and variables now
        // Call non static method first ---> create object for non static
        JavaClassFour obj =new JavaClassFour();   // constructor is called and creates an object and store it in a reference variable

        System.out.println(obj.phoneNum);         // Simply print it with obj.variable name

        // Now call static method with class name w/o object

        JavaClassFour.printValue();








    }
}
