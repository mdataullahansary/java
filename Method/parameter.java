package Method;

public class parameter {
    // static void myMethod (String lastname) {
    //     System.out.println(lastname + "  Ansary");
    // }
    
    // public static void main(String[] args) {
    //     myMethod("Ataullah");
    //     myMethod("Asad");
    //     myMethod("Mizu");

    // }

    static void checkedAge ( int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        }
        else  {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkedAge(20);
    }
}
