public class Subtract {
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

class SubtractDemo {
    public static void main(String[] args) {
        Subtract s = new Subtract();

        System.out.println("Subtract(int,int) = " + s.subtract(10, 5));
        System.out.println("Subtract(double,double) = " + s.subtract(10.5, 2.5));
        System.out.println("Subtract(int,int,int) = " + s.subtract(20, 5, 3));
    }
}
