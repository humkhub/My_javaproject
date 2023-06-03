package Class_Assignments;

public class Factor {
    /* Write a program which will return the factors. If you provide the number,it will find the factors
    Example: If given number is 5, if we mulitiply it by 5 * 4 * 3* 2* 1.
    It is used to calculate the factors of any number
    Steps: 1-Create one static method and it should be parameterized
    2- Create a for loop
    3- Call this method and since it is static so call directly by classname
    4- syntax of calling is classname.methodname();
    5- This has to store in any variable so cretea one variable after =  whihc is int result
    Logic: i = 1 unless i is not or less than equal to num which is 5, this loope will be iterated
    Multiply it with the result which is fact multiplied by i
    factvar = 1 and i=1 condition met so will iterate again
    factvar = 2 and i=2 condition met so iterate again
    factvar =3 and i=3 condition met so iterate again
    factvar = 4 and i=4 condition met so iterate again
    factvar =5 and i=5 condition met so iterate again
    factvar 6 and i=5 condition not met so will go outside the loop
    */

    public static int calculateFactor(int num){
        int factvar = 1;                                // create method with parameter

        for ( int i= 1; i<=num; i++){
            factvar = factvar*i;
        }
        return factvar;

    }
    public int calculateDoubleFactor(int num){ //create another non static method and that will return double of this value
        int double_value = num*2;

        return double_value ;
        // now all the method by object
    }
    public static void main(String[] args) {
       int result = Factor.calculateFactor(5); //calling method by classname
        System.out.println(result);

        Factor obj = new Factor(); // constructor to create object to call the method
        int result2 = obj.calculateDoubleFactor(result);
        System.out.println(result2);
    }


}



