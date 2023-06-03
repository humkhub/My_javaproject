package Code_Humkh;

public class ApplePhone extends InheritPhoneParent{
/* This class acquired all the properties of parent class
but it can have its own properties too which we can access from the main class
 */

    String touchButton = "Touchless";
    String display = "Retina";

    public void turnOn(){
        System.out.println("This Apple phone has a special turn on Button");
    }

}
