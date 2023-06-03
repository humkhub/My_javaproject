package Encapsulation;

public class EncapExample {
    private int phoneNumber;

    public void setPhoneNumber(int value) {
    this.phoneNumber = value;

    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public static void main(String[] args){
        EncapExample objEncap = new EncapExample();
        objEncap.setPhoneNumber(123);
        System.out.println("the phone number is "+ objEncap.getPhoneNumber());


    }








}
