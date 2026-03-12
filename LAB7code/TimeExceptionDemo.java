import java.util.Scanner;

class InvalidHourException extends Exception {
    public InvalidHourException(String msg) {
        super(msg);
    }
}

class InvalidMinuteException extends Exception {
    public InvalidMinuteException(String msg) {
        super(msg);
    }
}

class InvalidSecondException extends Exception {
    public InvalidSecondException(String msg) {
        super(msg);
    }
}

class Time {
    int hours, minutes, seconds;

    public void setTime(int h, int m, int s)
            throws InvalidHourException, InvalidMinuteException, InvalidSecondException {

        if (h < 0 || h > 24)
            throw new InvalidHourException("hour is not greater than 24");

        if (m < 0 || m > 60)
            throw new InvalidMinuteException("hour is not greater than 60");

        if (s < 0 || s > 60)
            throw new InvalidSecondException("hour is not greater than 60");

        hours = h;
        minutes = m;
        seconds = s;

        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

public class TimeExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t = new Time();

        System.out.print("Enter hours: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes: ");
        int m = sc.nextInt();
        System.out.print("Enter seconds: ");
        int s = sc.nextInt();

        try {
            t.setTime(h, m, s);
        } catch (Exception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
