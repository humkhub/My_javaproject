package Method_Over_Riding;

import Method_Over_Riding.AnimalOverRide;
import Method_Over_Riding.CowOverRide;
import Method_Over_Riding.HorseOverRide;
import Method_Over_Riding.RabbitOverRide;

public class MainAnimalOverRide {
    // Runtime Polymorphism or Dynamic Method Dispatch

    public static void main(String[] args) {
        //creating objects of all the parent and child classes from animal, cow, horse and rabbit

        // calling method place() of Animal class
        AnimalOverRide animalObj = new AnimalOverRide();
        animalObj.place();
        // calling method place() of Horse class
        HorseOverRide horseObj = new HorseOverRide();
        horseObj.place();

        // calling method place() of Cow class
        CowOverRide cowObj = new CowOverRide();
        cowObj.place();

        // calling method place() of Rabbit class
        RabbitOverRide rabbitObj = new RabbitOverRide();
        rabbitObj.place();
    }
}
