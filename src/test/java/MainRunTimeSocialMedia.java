import java.util.Scanner;

public class MainRunTimeSocialMedia {

    public static void main(String[] args) {
         //creating objects for method overriding and invoking methods
        SocialMediaRunTime socialObj = new SocialMediaRunTime();
        socialObj.post();
        socialObj.follow("Sam", 1);
//        socialObj.create(15, 20, "123 street MO");

        FacebookRunTime socialFB = new FacebookRunTime();
        socialFB.post();
        socialFB.follow("Kim", 2);
//        socialFB.create(20, 25, " 908 Elm Street NY");

        InstagramRunTime instaObj = new InstagramRunTime();
        instaObj.post();
        instaObj.follow("Ali", 3);
//        instaObj.create(25, 30, "1108 Game Road TX");

// Same concept with a Scanner Class
//        System.out.println("Which one of the following is your favorite social media?\nFacebook, Instagram, SocialMedia");
//        Scanner scanObj = new Scanner(System.in);
//        String userChoice =scanObj.next(); // user choice will be saved in the variable userChoice
//
//        switch (userChoice) {            // switch case method for choices
//               case "Facebook":
//                FacebookRunTime objFB = new FacebookRunTime();
//                objFB.post();          // calling post method
//                break;                 // breaks the program at this point
//
//               case "Instagram":
//                InstagramRunTime objInt =new InstagramRunTime();
//                objInt.post();
//                break;
//
//            case "SocialMedia":
//                SocialMediaRunTime objsoc = new SocialMediaRunTime();
//                objsoc.post();
//                break;
//
//           default:                        // default works if none of the choice work
//                System.out.println("Try Again!!!");
//                break;
//
//
//                }

        }

    }

