public class InstagramRunTime extends SocialMediaRunTime{
    //method overriding
    public void post() {

        System.out.println("Instagram posting is very creative");
        System.out.println("---------------------------------------------------");
    }
    public void follow(String name, int id){
        System.out.println("Instagram followers are in Millions like "+name+" and have thier own unique id numbers like " +id);
        System.out.println("---------------------------------------------------");
    }
//
//    public void create(int age, int age2, String address) {
//        System.out.println("Reels are a good way to create and post within this age group "+age+" and "+ age2+" who live on "+address);
//    }

}
