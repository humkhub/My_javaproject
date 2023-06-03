package Class_Assignments;

public class BananaProg {
    /* Assignment # 5
    There is String value = Banana
    Count the occurrence of a character  in this String, how many times a letter exists inside it. How many count of a character?
    On output, it should print 3 times because a is 3 in this Stirng
    Hint : Use == oeprator to compare character or numbers etc
    After we will learn how to count each and every character inside a String
     */
    public static void main(String[] args) {

         String word = "banana";
         char CharA = 'a';
         int count = 0;

         for (int i = 0; i < word.length(); i++){
             if (word.charAt(i) == CharA){
                 count++;

             }
        }

        System.out.println("Occurence of "+ CharA+ " in the string is "+ count+ " times");


        }
    }

/* Explain
1- We  initialize the string word as banana and the character CharA as "a"
2- Then iterate over ech character in the string using 'a" for loop
3- To check if the current character is equal to the CharA using the ==operator
4- If they are equal we increment the count variable.
5- Finally we print out the count which represent the number of occurrences of the character a
 */
