package Class_Assignments;

public class StudentData {

    String name;
    String age;
    String phone;

    public StudentData (String name, String age , String phone){    // constructor
        this.name = name; // blank final field
        this.age = age;
        this.phone= phone;

    }


    public static void main(String[] args) {
        StudentData student1 = new StudentData(" John ", " 20 ","21234567");
        StudentData student2 = new StudentData(" Sam ", " 25 ","12345678");
        StudentData student3 = new StudentData(" Peter ", " 30 ","98765432");
        StudentData student4 = new StudentData(" Kate  ", " 36 ","89765432");
        StudentData student5 = new StudentData(" Lynda ", " 40 ","45678923");


        System.out.println(student1.name + student1.age + student1.phone);
        System.out.println(student2.name + student2.age + student2.phone);
        System.out.println(student3.name + student3.age + student3.phone);
        System.out.println(student4.name + student4.age + student4.phone);
        System.out.println(student5.name + student5.age + student5.phone);





    }

}
