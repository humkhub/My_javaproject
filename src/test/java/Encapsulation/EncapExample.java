package Encapsulation;

public class EncapExample {      // My demo in class
    private int phoneNumber;

    public void setPhoneNumber(int phoneNum) { // setter method
    this.phoneNumber = phoneNum;                // this keyword is optional

    }

    public int getPhoneNumber() {       // getter method
        return phoneNumber;
    }
    public static void main(String[] args){
        EncapExample objEncap = new EncapExample();
        objEncap.setPhoneNumber(123); // initialize variable values here or set values by setter methods

        int ph = objEncap.getPhoneNumber();// getting printing or reading values here
        System.out.println("the phone number is "+ objEncap.getPhoneNumber());
        //or
        System.out.println("the phone number is "+ ph);


    }








}
