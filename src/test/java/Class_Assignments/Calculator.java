public class Calculator {

    /* 1- Find the prime number between 1-50......Not done yet
     2- Write a program to perform calculator functionality...addition, minus, multiply and divide methods inside class
     */
    public int calcAdd(){
        int a = 10;
        int b = 6;
        int c = a + b;

        return c ;
    }

    public int calcSub() {
        int a1 = 20;
        int b1 = 5;
        int c1 = a1 - b1;

        return c1;

    }
    public int calcMulti() {
        int a2 = 5;
        int b2 = 5;
        int c2 = a2 * b2;

        return c2;
    }
    public int calcDiv() {
        int a3 = 10;
        int b3 = 2;
        int c3 = a3 / b3;

        return c3;
    }

    public static void main(String[] args) {            // no need to call all 4 methods can just use the first one

        Calculator CalcObj = new Calculator();// calling calcAdd
        int addition = CalcObj.calcAdd();

        //Calculator CalcObj1 = new Calculator();// calling calcSub
        int subtraction = CalcObj.calcSub();

        //Calculator CalcObj2 = new Calculator();// calling calcMulti
        int multiplication = CalcObj.calcMulti();

        //Calculator CalcObj3 = new Calculator();// calling calcDiv
        int division = CalcObj.calcDiv();



        System.out.println("Sum of a + b = " + addition );
        System.out.println("Subtration of a1 - b1 = " + subtraction );
        System.out.println("Multiplication of a2 * b2 = " + multiplication  );
        System.out.println("Diviosn of a3 / b3 = " + division );



    }













}



