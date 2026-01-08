import java.util.Scanner;

public class Student {
    int roll;
    String name;
    double cgpa;
}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        double lowest = Double.MAX_VALUE;
        String lowestName = "";

        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.print("Enter Roll: ");
            s[i].roll = sc.nextInt();

            sc.nextLine(); // buffer clear
            System.out.print("Enter Name: ");
            s[i].name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            s[i].cgpa = sc.nextDouble();

            if (s[i].cgpa < lowest) {
                lowest = s[i].cgpa;
                lowestName = s[i].name;
            }
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].roll + "  " + s[i].name + "  " + s[i].cgpa);
        }

        System.out.println("\nStudent with Lowest CGPA = " + lowestName);
    }
}
