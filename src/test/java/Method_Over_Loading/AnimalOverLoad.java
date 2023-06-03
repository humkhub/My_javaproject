package Method_Over_Loading;

public class AnimalOverLoad {         // Method Overloading
    /*
    This is related to polymorphism. You can make different classes. We can use one word for that class.
    Use one name with multiple forms. Animal is single but there are many forms of animals.
    Every animal has a different sound and will use only one name for all the methods.
    With this we can represnet multiple forms of the entity.
    Animal class is supercalss and cat, dog are child classess or subclasses of Animal class.
    it can be achieved with inheritance by usning extend keyword
    Following is an example of method overloading where there aer multiple methods but paramteres are different
    changing order or paramerter list is not considered duplicate otherwise it will show it duplicate
    Conditions....number of parameters and order of parameters should be different with same method name is
    method overloading
    NO NEED TO EXTEND TO OTHER CLASS IN METHOD OVERLOADING
     */
    public static void sound(){          //
        System.out.println("No Animal Sound");
    }
    public static void sound(String animalName){
        System.out.println("Animal Sound "+ animalName);
    }
    public static void sound(int age, String animalName){
        System.out.println("Animal age "+ age);
    }

    public static void sound( String animalName, int age, String animalColor){
        System.out.println("Animal name "+ age + animalColor);
    }

    public static void main(String[] args) {
        AnimalOverLoad.sound( "cat" , 9, " white");
        //AnimalPoly.sound(Cat);
        // we can all the same name method with different arguments
    }





    }
