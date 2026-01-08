import java.util.Scanner;

public class RectangleArea {
    double length, breadth;

    RectangleArea() {
        length = 0;
        breadth = 0;
    }

    RectangleArea(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RectangleArea r1 = new RectangleArea();
        System.out.println("Area (default constructor) = " + r1.area());

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        RectangleArea r2 = new RectangleArea(l, b);
        System.out.println("Area (parameterized constructor) = " + r2.area());
    }
}
