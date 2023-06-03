package Method_Over_Riding;

import Method_Over_Riding.AndroidPhone;
import Method_Over_Riding.Iphone;
import Method_Over_Riding.SmartPhoneParent;

public class MainSmartPhone {

    public static void main(String[] args) {

        //calling subclass (already inherited from SmartphoneParent class) which is overriding parent class
        Iphone objIphone = new Iphone();
        objIphone.makeCall(800212);

        //calling subclass which is overriding parent class
        AndroidPhone objAndrd = new AndroidPhone();
        objAndrd.makeCall(800212);


    }
}
