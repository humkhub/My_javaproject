package Constructors;

public class ConstructorConcept {

    public ConstructorConcept(){
        System.out.println("It is a user defined non parametrized constructor");
    }

    public ConstructorConcept(String name){
        System.out.println("It is a user defined parametrized constructor and name is "+ name);
    }
    public ConstructorConcept(String address, int phone_number){
        System.out.println("It is a user defined parametrized constructor and name and phone number are "+ address + phone_number);
    }
    public static void main(String [] args){
        ConstructorConcept object = new ConstructorConcept();//when anymethod same as class it is a coontrtucor
        ConstructorConcept object1 = new ConstructorConcept("Humaira");// This syntax is called calling line
        ConstructorConcept object2 = new ConstructorConcept("123 Street ", 12345);

    }
}
