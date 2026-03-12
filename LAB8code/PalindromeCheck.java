import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();

        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");
    }
}
