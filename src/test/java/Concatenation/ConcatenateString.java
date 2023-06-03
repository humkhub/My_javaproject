package Concatenation;

public class ConcatenateString {
    /*Assignment#4: Concatenate any of two string using non-static method
    Approach:string a = "" String b = ""
return : concatenation of both strings
 */
    public String StringConcat() {                             // Create a non-static method of data type string
        String a = " A customer can add products to the cart now.";
        String b = " Go to the following link: https://uat-iqrashopingdemo.ml/";
        String c = a + b;

        return c;
    }public static void main(String[] args) {



        ConcatenateString strObj = new ConcatenateString();      // calling StringCon Method, where Concatenation.ConcatenateString() is the constructor and new keyword invoke this constructor to access the c variable . Here strObj is the reference variable,

        String combinestring = strObj.StringConcat();            //

        System.out.println(" Add to Cart feature:\n " + combinestring);



    }
    }
