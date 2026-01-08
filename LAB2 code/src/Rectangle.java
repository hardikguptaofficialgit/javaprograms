import java.util.Scanner;
public class Rectangle {
    double length, breadth, area, perimeter;
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }
    void display() {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.calculate();
        r.display();
    }
}
