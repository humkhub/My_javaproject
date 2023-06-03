package Java_Classes;

public class JavaClassOne {                                                                      // curly braces define th scope of the class
                                                                                                   // a identifier is being used at 3 places, inside class scope, inside sum method scope and isndie minus method scope
       int a = 10;

    public void sum() {                                                                            // INSTANCE METHOD COZ NON STATIC OR NO STATIC KEYWORD
        int a = 15;                                                                                 // curly braces for method scope
                                                                                                     // a is not accessable outside the class but can be accesed in class and method coz method also belongs to that class
        System.out.println("Eg of Local Variable a of sum method " + a);
                                                                                                     // a is a LOCAL VARIABLE coz declared inside a METHOD
    }
    public static void minus(){
         int a = 20;                                                                                     // second method inside the class but static now

        System.out.println("Eg of static method minus " + a);                                          // To call static method just use classname with a dot and that particular method
    }
        //Keywords, Identifiers
    public static void main(String[] args) {
                                                                                                          // a is a GLOBAL VARIABLE coz declared inside a class and can be used anywhere inside or outside method within th class scope
                                                                                                        // variable is data member             // int a = 10, int is Keyword, a is an identifier and 10 is a value
                                                                                                       // indentifier are uniques
                                                                                                      // Creating an OBJECT to call this sum method

        JavaClassOne object = new JavaClassOne();                                             // here new DemoPracticeQa(); is a constructor
        object.sum();
                                                                                                    // here OBJECT is called a REFERENCE VARIABLE TO STORE THE REFERENCE OF THIS CLASS
        JavaClassOne.minus();

        System.out.println("Eg of Global Variable "+object.a);


    }


// Class # 3
    /* Create a Class ...Write main method....write print method....

     */

    }

