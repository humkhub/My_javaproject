public class Iphone extends SmartPhoneParent{
        @Override
        public void makeCall(int phoneNumber) {
            // Perform additional iPhone-specific operations
            System.out.println("Calling " + phoneNumber + " using iPhone");
        }
}
