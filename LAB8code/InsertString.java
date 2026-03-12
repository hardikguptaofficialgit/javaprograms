import java.util.Scanner;

public class InsertString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the string to be inserted into first string: ");
        String str2 = sc.nextLine();

        String result = str1 + " " + str2;

        System.out.println("The string after insertion is: " + result);
    }
}
