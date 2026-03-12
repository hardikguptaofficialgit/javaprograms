import java.io.*;
import java.util.Scanner;

public class StudentFileProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter existing file name: ");
            String fileName = sc.nextLine();

            FileWriter fw = new FileWriter(fileName, true);
            fw.write("Roll No: " + roll + "\n");
            fw.write("Name: " + name + "\n");
            fw.write("Subject: " + subject + "\n");
            fw.write("Marks: " + marks + "\n");
            fw.write("----------------------\n");
            fw.close();

            System.out.println("\nContent of file:");

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println(e);
        }

        sc.close();
    }
}
