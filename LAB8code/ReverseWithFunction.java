import java.util.Scanner;

public class ReverseWithFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String rev = new StringBuilder(str).reverse().toString();

        System.out.println("The string after reversing is " + rev);
    }
}
