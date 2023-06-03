package Method_Over_Riding;

import Method_Over_Riding.SmartPhoneParent;

public class Iphone extends SmartPhoneParent {
        public void makeCall(int phoneNumber) {
            System.out.println("Calling " + phoneNumber + " using iPhone");
        }
}
