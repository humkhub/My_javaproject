package Method_Over_Loading;

public class SmartPhoneCamera {
    // method overloading example
    public void takePhoto(){

    System.out.println("iPhone Camera can capture a photo instantly");
    }
    public void takePhoto(int timerDelay){
        System.out.println("iPhone camera can take photos within "+ timerDelay+ " seconds");

    }

    public void takePhoto(String mode){
        System.out.println("iPhone has a mode name called  "+ mode);
    }


    public static void main(String[] args) {
        SmartPhoneCamera objCam = new SmartPhoneCamera();
        objCam.takePhoto();

        objCam.takePhoto(5);

        objCam.takePhoto("portrait");
    }

}
