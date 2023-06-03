package Encapsulation;

public class EncapDemo {
    // Declare private coz it is related to data hiding
    private String pwd;

    // Declare getter method to retrieve that value of the variable outside the class
    // These methods are for encapsulation only
    public String getPassword(){
        return this.pwd;

    }
    public void setPassword(String password){
        this.pwd = password;
    }

    public static void main(String[] args) {
        EncapDemo objEncap = new EncapDemo();
        objEncap.setPassword("admin");

        System.out.println("The account password is "+objEncap.getPassword());
    }
}