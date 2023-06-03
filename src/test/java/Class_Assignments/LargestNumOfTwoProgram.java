public class LargestNumOfTwoProgram {
/* Write a program to find the largest number between 2 numbers by using non-static method
From parameters pass 2 numbers,
That method will print which number is largest for example passing 6 and 4 so print 6
 */

   public int findLargestOfTwo(int numberOne, int numberTwo ){
    if ( numberTwo > numberOne){
        //System.out.println("The biggest number between" + "1  and 30 is " + result);
        System.out.println("The biggest number between " +  numberOne +  " and " + numberTwo +" is " + numberTwo);
        return numberTwo;
    }
    else {
        System.out.println("The biggest number between " +  numberOne +  " and " + numberTwo +" is " + numberOne);
        return numberOne;
    }
   }

    public static void main(String[] args) {
        LargestNumOfTwoProgram objget = new LargestNumOfTwoProgram();
        int result = objget.findLargestOfTwo(5, 10);

    }


}
