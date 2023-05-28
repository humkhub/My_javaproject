public class NumberEnhancerStatic {

        ////public static int enhance(int num1, int num2) {
                                                                    // Perform enhancement logic on the number
            ////return num1 + num2 ;
        ///}

        //public static void main(String[] args) {
            ////int result = NumberEnhancerStatic.enhance(11,10);
            //System.out.println( result );
        //}
    //}
// solve it with if else method
       public static int enhance(int num1,int num2){
       if (num1>num2){
           System.out.println("Enhanced Number "+ num1);
           return num1;
       }
       else {
           System.out.println("Enhanced Number "+ num2);
           return num2;
       }
       }

    public static void main(String[] args) {
        NumberEnhancerStatic.enhance(2,1);
    }
}
