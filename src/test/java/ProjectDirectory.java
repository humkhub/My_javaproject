public class ProjectDirectory {

    public static void main(String[] args) {

        /* /Users/rawaiyad/Documents/Java_Workspace/test_javaproject...>path of Java project
        If this project is relocated to somehwere else and want to get the location of the prokject.
        We can use a predefined class called System.getProperty()method

        Code: System class with a static method getProperties() and can be called by class name
        user.dir is one of the property that Java can recognize
        if Java is asked to call this method with user.dir property as a parameter then it will get us a path of
        the project.
        Since user.dir is in the string format and we have passed a string parameter here
        we need to make it in a string format by using a local variable pathOfProject with String return type
        */

        String pathOfProject = System.getProperty("user.dir");

        System.out.println(pathOfProject);



        }
    }

