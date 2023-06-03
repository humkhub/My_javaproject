package Loops;

public class ReverseLeftForLoop {

    public static void main(String[] args) {

        for (int i= 5; i>=1; i-- ){ // inner for loop

            for (int j= 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
