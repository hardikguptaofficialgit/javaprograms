class Student {
    int rollno;
    String name;

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.rollno == s.rollno && this.name.equals(s.name);
    }
}

public class CompareUsingEquals {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aman");
        Student s2 = new Student(101, "Aman");

        if (s1.equals(s2))
            System.out.println("Both students are equal");
        else
            System.out.println("Students are not equal");
    }
}
