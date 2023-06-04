package Abstaraction;

public class CarMain {
    public static void main(String[] args) {
        CarAbstract obj = new BMW();
        obj.start();                // calling abstract method

        obj.stop();               // calling non abstract method

        obj =new Audi();
        obj.start();
    }
}
