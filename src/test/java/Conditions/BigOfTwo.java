public class BigOfTwo {
    /*public int findBigNum(int num1, int num2) {// parametres
        if (num1 > num2) { // if else statement
            //System.out.println("The largest number between " + num1 + " and " + num2 + " is " + num1);
            System.out.println("The largest number is " + num1);
            return num1;
        } else {
            System.out.println("The largest number between " + num1 + " and " + num2 + " is " + num1);
            return num2;
        }
    }
        public static void main (String[]args){

            BigOfTwo numobj = new BigOfTwo();
            numobj.findBigNum(20, 10);
        }

    }
*/
    public int findBig(int num1, int num2){
        if (num1 >num2){
            System.out.println("The biggest number is "+num1);
            return num1;
        }
        else {
            System.out.println("The biggest numer is "+num2);
            return num2;
        }
    }
        public static void main(String[] args){
        BigOfTwo obj = new BigOfTwo();
        obj.findBig(20,10);

        }
        }
