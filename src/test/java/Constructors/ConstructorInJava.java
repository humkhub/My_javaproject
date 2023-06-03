public class ConstructorInJava {

    // create class Or instance variables. These varaibles can be initialezed here but initiliaze them in consturors
   String name = "Sam";
   int age = 10;

   // Now initialize these variables with the help of constructor
    public ConstructorInJava (){        // constructor format of default constructor coz no PARAMETERS IN CONSTRUCTOR
        System.out.println("It is a user defined constructor"); //It will not print anything coz construdctor is not being called. To call the cosntructor create an object firts in the main methd
    }
// Now create a paramertrized or user defined constructor
   // Duplicate constructors are not allowed
    // Creating more than one constructor under class in CONSTRUCTOR OVERLOADING with different parameters but same classname.

    public ConstructorInJava (int age){
        System.out.println("It is a one parameter constructor");
    }

    public ConstructorInJava (int age, String name){ // These parametrs ar different from class variables but here these are LOCAL VARIABLES
        System.out.println("It is a two paramterer constructor");
        // To call the class or instance variables, we need to create another object with "THIS''KEYWORD
        // The syntax of this object calling is
        //this.classvariable = localvaraible;
        // if we call line 36, age 10 and name sam will be given to loal variable first and then to classvariables to
        // initialize the class or instance variables. so lets see how it works
        this.name = name;
        this.age = age;
        // To avoid confustion with same class or local variables names, you can do two ways either use THIS KEYWORD
        // to distinguish or use different local variables

    }

    public static void main(String[] args) {

        ConstructorInJava objcons = new ConstructorInJava(); // The momennt we create the object, automatically consturctor will be called.
// since the construcor here is non parametrized so it will call only non prametrized constructor and print its statement only.
        // To call parametrized constructors, create another object with some paramertrized values

        ConstructorInJava objconsonepara = new ConstructorInJava(10);
        // Now call the two parameter construor with anther object

        ConstructorInJava objconstwopara = new ConstructorInJava(10, "Sam");

        System.out.println(objconstwopara.name);
        System.out.println(objconstwopara.age);





    }
}
