import java.util.Scanner;

public class CharacterPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int pos = str.indexOf(ch);

        if (pos != -1)
            System.out.println("Position of entered character: " + pos);
        else
            System.out.println("Entered character is not present");
    }
}
