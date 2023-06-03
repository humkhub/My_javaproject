package Class_Assignments;

public class LeftStarForLoop {


    public static void main(String[] args) {
        /* Write a for loop star pattern which will print 5 stars ***** in a pattern
        Given: 5 rows and 5 columns
         */

        for (int i = 1; i <= 5; i++) { // Outer for loop
                                                                      // Row i = declaration of i variable, conditional, incremental --> The loop should continue till i value equals 5 and work 5 times
            for (int j = 1; j <= i; j++) {// inner for loop

                System.out.print("* ");
            }   //end of j                                             // Col j= declaration of j variable, conditional, incremental
                System.out.println();// print it outside of for loop


            }   // end of i

            }   // end of main method

            }   // end of class



/*
What is for loop?
for (int j = 1; j <= 10; j ++) {     // intialization is int j =1, conditional, incremental/decremental
System.out.println(j);
}

How to explain for loop?
j = 1 check
j = or less than 5 check true
j = increase value of i variable by 1 or i=i+1
Now if all of the above conditiions are met, compiler will start from main method
Next it will check all the condions if j is equal to one
j is less than 10
It will go to println and will print j or 1
Then it will increase the value by j++ or 2
It will agian check if the value of 2 is less than 10 and codition is sastisfied will print 2 on the console
Again 2++ means 3 and 3 is less than 10 so will print 3 on the console
It will go to 4, 5, 6, 7, 8, 9 and finally 9++ is equal to 10 and
condition is still met so will print 10
Then will go to 10++ which is 11
which is false in our condition
it will come out of the for looop
and program will be over


Now print 10-1 in decremental order
for (int k = 10; k >= 1; k --)
if k =1 will print 1o
now go to see k-- which is 9
it will now check if k>9 so true and will print 9
then 9-- is wqual to 8 the will print 8
then till 1-- which is zero so will go out of the loop
and program will close

 */







