package Constructors;

public class ChainConstructor {
    /*
    use the syntax this(); to call the current class constuctor and
    this without parenthesis mean to call the current class object
    Steps: 1- JVM starts from main so parmetr is int type
    2- It will jump or call to 2nd con which is int type but it has this() keyword with string type
    3- It will find the string type constructor next which is 3rd constructor and has this() w/o any param
    4- It will jump back to 1st constructor
    5- Since there is no calling her only the statment to print
    6-It will print that first constructor statement
    7- it will jump back to 3rd constructor and print statemnet
    8-The wiil control go back to 2nd constructor and print statemnet
    Note; To change the sequence in print just change the calling line
    You can only call one user defined construtor
    The sequence can also be changed from tehe object calling line too.
    Important: constructor calling LAST will be the FIRST in the output
    RECURSIVE TYPE: it is not allowed to call 1st construcrtor in 2nd and in 2nd calling 1st. 1-2 and 2-1 is not allowed

      */
    public ChainConstructor(){
        System.out.println("First Non parametrized constructor");
    }
    public ChainConstructor(int num){
        this("Kim"); // calling line shoudl be the first line of constructor
        System.out.println("Second parametrized constructor");
    }
    public ChainConstructor(String name){
        this();
        System.out.println("Third parametrized constructor");
    }

    public static void main (String [] args){
        ChainConstructor obj = new ChainConstructor(10);


    }
}
