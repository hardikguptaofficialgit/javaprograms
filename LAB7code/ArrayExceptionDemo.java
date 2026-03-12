import java.util.Scanner;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] arr = new int[4];   // array size is 4
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < 5; i++) {   // trying to store 5 numbers
                arr[i] = sc.nextInt();      // will cause exception at i = 4
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" " + e);
        }
    }
}
