public class JavaClassTwo {
    //String weblink = "www.amazon.com";
    int cartvalue = 2;
    static boolean flag1 = true;
    boolean flag2 = false;

    public static void main(String[] args) {                                      // void is not returnable method
        // Creating IF BLOCK. If statement is true it will be executed inside that block otherwise null.
        if (flag1) {
            System.out.println("Print Flag if it is a true statement");

            JavaClassTwo obj   =   new JavaClassTwo();

            int returnValue = obj.returnTwoValues();           //?

            System.out.println("Sum of Return Method  " + returnValue );

            // Creating ELSE Statements
            if (returnValue> 5 ){
                System.out.println("true" );

            }

        }
    }
      // Creating a RETURN method so retuen any value of int, string etc
        public int returnTwoValues(){                                    // Return int type value
          int a = 10;
          int b = 20;
          int c = a + b;

          return c ;

        }





}
