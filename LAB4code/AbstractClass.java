abstract class Student {
    int rollno;
    long regno;

    void getinput(int r, long reg) {
        rollno = r;
        regno = reg;
    }

    abstract void course();
}




class Kiitian extends Student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getinput(24155627, 1234567890L);

        System.out.println("Rollno - " + k.rollno);
        System.out.println("Registration no - " + k.regno);
        k.course();
    }
}
