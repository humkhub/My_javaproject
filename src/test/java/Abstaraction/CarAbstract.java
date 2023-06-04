package Abstaraction;

abstract class CarAbstract {

    abstract void start();    // abstract method for declaration only

    void stop(){              // non -abstract method
        System.out.println("Car's breaks are running fine ");

    }

}
