public class AndroidPhone extends SmartPhoneParent{
        @Override
        public void makeCall(int phoneNumber) {
            // Perform additional Android-specific operations
            System.out.println("Calling " + phoneNumber + " using Android Phone");
        }
}
