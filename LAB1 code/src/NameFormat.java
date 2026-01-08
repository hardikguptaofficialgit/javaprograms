import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String last = sc.nextLine();

        System.out.println("Formatted Name: " + last + " " + first);
    }
}
