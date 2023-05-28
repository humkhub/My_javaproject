public class AddTwoValue {
    public int demo() {

        int a = 2;
        int b = 4;
        int c = a + b;

        return c;
    }

    public static void main(String[] args) {

        AddTwoValue obj = new AddTwoValue();
        int addition = obj.demo();

        System.out.println("Sum of a + b = " + addition );

    }
}



