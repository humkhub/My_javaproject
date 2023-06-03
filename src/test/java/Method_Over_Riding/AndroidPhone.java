package Method_Over_Riding;

import Method_Over_Riding.SmartPhoneParent;

public class AndroidPhone extends SmartPhoneParent {

        public void makeCall(int phoneNumber) {

            System.out.println("Calling " + phoneNumber + " using Android Phone");
        }
}
