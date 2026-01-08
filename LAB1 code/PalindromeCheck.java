import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:- ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        while(temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if(num == rev)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is NOT Palindrome");
    }
}