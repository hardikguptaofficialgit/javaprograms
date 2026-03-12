import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string for comparison: ");
        String str2 = sc.nextLine();

        int result = str1.compareTo(str2);

        System.out.println("The difference between ASCII value is " + result);
    }
}
