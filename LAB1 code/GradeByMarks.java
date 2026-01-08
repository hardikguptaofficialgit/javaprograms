import java.util.Scanner;

public class GradeByMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        char grade;

        if(marks >= 90 && marks <= 100)
            grade = 'O';
        else if(marks >= 80)
            grade = 'E';
        else if(marks >= 70)
            grade = 'A';
        else if(marks >= 60)
            grade = 'B';
        else if(marks >= 50)
            grade = 'C';
        else
            grade = 'F';

        System.out.println("Grade: " + grade);
    }
}
