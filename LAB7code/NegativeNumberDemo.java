import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}

class ProcessInputClass {
    public void ProcessInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (num * 2));
        }
    }
}

public class NegativeNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        ProcessInputClass obj = new ProcessInputClass();

        try {
            obj.ProcessInput(num);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
