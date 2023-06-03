package Method_Over_Riding;

import Method_Over_Riding.SocialMediaRunTime;

public class FacebookRunTime extends SocialMediaRunTime {

    public void post() {
        System.out.println("Facebook is a good place to post");
        System.out.println("---------------------------------------------------");
    }
    public void follow(String name, int id){
        System.out.println("Friends can follow each other on Facebook like "+ name + " with a unique id: " +id);
        System.out.println("---------------------------------------------------");
    }
//
//    public void create(int age, int age2, String address) {
//        System.out.println("Creating a post on FB is very easy for people who are between "+ age+" and "+ age2 +" and live on"+ address);
//    }
}
