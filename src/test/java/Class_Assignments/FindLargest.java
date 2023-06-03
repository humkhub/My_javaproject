public class FindLargest {
    public int findBigTwo(int num1, int num2 ){
        if (num1 > num2){
            System.out.println("The largets number between 2 and 3 is "+ num1);
            return num1;
        }
        else {
            System.out.println("The biggest number bewteen 2 and 3 is "+num2);
            return num2;
        }
    }

    public static void main(String[] args) {
        FindLargest objnum = new FindLargest();
        objnum.findBigTwo(3,2);
    }
}
