import java.util.Scanner;

public class Fruit {
    /*
    Assignment: There is one shop selling multiple items like banand, apple, grapes, mango
    Create one class = fruit
    Overloading Method name= eat() with paramters at run time
    it shoud print eating banana, bunch of banana, apple color is red
    print i am eating banana
    eat (string apple, int number)....print....i am eating banana
    OR you can also use the scanner class from use ask which fruit you like to eat? pass bananda..
    it will automatically pick the banna method
    it is compile time polymorphisim or method overloading
     */

    public static void eat() {
        System.out.println("No one is having any fruit ");
    }

    public static void eat(String fruitName, int numOffruit) {
        System.out.println("I'm eating " + numOffruit+ " "+ fruitName);
    }

    public static void eat(float priceoffruit, String fruitNameOne) {
        System.out.println("This fruit is very expensive " + priceoffruit+ " per pound "+ fruitNameOne);
    }

    public static void eat(int numOftimes, String tasteOfFruit, float price) {
        System.out.println("This fruit is " + tasteOfFruit+ "and I bought "+ numOftimes + " and per pound is "+price);
    }

    public static void main(String[] args) {

        Scanner objFruit = new Scanner(System.in);

        System.out.println("Which fruit is your favorite? ");
        String inputFruit = objFruit.next();
        System.out.println("This person's favorite fruit is " + inputFruit);

        System.out.println("How many fruits are you eating? ");
        int inputnumFruits = objFruit.nextInt();

        System.out.println("What's the price of the fruit per pound? ");
        float inputfruitPrice = objFruit.nextFloat();

        Fruit.eat(inputFruit, inputnumFruits);                             // Call the appropriate eat() method based on user input
        Fruit.eat(inputfruitPrice,inputFruit);                             // Call another appropriate eat() method based on user input
    }
}

        //Fruit.eat();
        //Fruit.eat("Apples", 2);
        //Fruit.eat(7.99f,"Strawberries");
        //Fruit.eat(5,"sweet",4.35f);

   // }
//}

