package Encapsulation;

public class EncapDemo { // class by Vishal
    // Declare private coz it is related to data hiding
    private String pwd;

    // Declare getter method to retrieve that value of the variable outside the class

    public void setPassword(String password){ // setter method syntax
        this.pwd = password;
    }
    public String getPassword(){            // getter method syntax
        return this.pwd;

    }

    public static void main(String[] args) {
        EncapDemo objEncap = new EncapDemo();
        objEncap.setPassword("admin");

        System.out.println("The account password is "+ objEncap.getPassword());
    }
}