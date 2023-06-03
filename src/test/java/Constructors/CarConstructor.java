package Constructors;

public class CarConstructor {
    String model;
    int price;
    String engine;
    int wheels;
    int year_make;

    public CarConstructor(String model, int price, String engine, int wheels, int year_make) {
        // This is to call the ALL the class variables from the local variables coz both are different. Use THIS KEYWORD
        // This is how we initialze the properties but passing values will only be done by objects
        this.model = model;
        this.price = price;
        this.engine = engine;
        this.wheels = wheels;
        this.year_make = year_make;
    }

    public static void main(String[] args) {
        // Create objects to call the constructor and initialize
        CarConstructor carobj1= new CarConstructor("BMW", 200, "Automatic", 4, 2023);
        //one class object carobj will be created inside the memory and it will have 5 properties model, price, engine, wheels, yearmake
        //if tomorrow I add one more object with different properties it will be created inside the memory
        CarConstructor carobj2= new CarConstructor("Audi", 300, "Automatic", 5, 2000);
        // Create one more object car
        CarConstructor carobj3= new CarConstructor("Honda", 500, "Manual", 3, 2021);
// Remember name of objects will reamain same but properties can be changed

        // Now to access these properties use the print syntax in the same line or separte.
        System.out.println(carobj1.model+" "+carobj1.price+" " + carobj1.engine+ " "+ carobj1.wheels+" "+ carobj1.year_make);
        System.out.println(carobj2.model+" "+carobj2.price+" " + carobj2.engine+ " "+ carobj2.wheels+" "+ carobj2.year_make);
        System.out.println(carobj3.model+" "+carobj3.price+" " + carobj3.engine+ " "+ carobj3.wheels+" "+ carobj3.year_make);


    }
}
