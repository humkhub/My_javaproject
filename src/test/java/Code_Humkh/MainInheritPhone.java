package Code_Humkh;

public class MainInheritPhone {
    public static void main(String[] args) {
        /* If call ApplePhone class it has already acuired all the properties of InheritPhone paremt
        cos of the extends keyword
         */
        // calling all variables by creating object of child class which has nothing but inherited all from parent
        ApplePhone objAP = new ApplePhone();

         //objAP.color...> this will not call in this format here
        // either write in the following print statement or initialize it here instead under class

        System.out.println(objAP.color + " is a new color of this model");// make sure to print statments for calling variables

        System.out.println(objAP.screenSize+ " is good for viewing ");

        System.out.println(objAP.model+ " is brand new ");

        System.out.println(objAP.price+ " is expensive for this model ");

        // calling all methods of child class which has nothing but inherited all from parent class
        objAP.takePic();

        // calling the variable and method of child class now
        //objAP.display;
        //objAP.touchButton;
        System.out.println(objAP.display+ " is for sharp viewing ");
        System.out.println(objAP.touchButton+ " is a new feature ");

        objAP.turnOn();
        // It means that child class can have its own properties + acquires the parents


    }
}
