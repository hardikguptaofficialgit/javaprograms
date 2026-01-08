import java.util.Scanner;

class Sheet2D {
    double length, width;

    void input2D(Scanner sc) {
        System.out.print("Enter length (ft): ");
        length = sc.nextDouble();
        System.out.print("Enter width (ft): ");
        width = sc.nextDouble();
    }

    double cost2D() {
        return length * width * 40;
    }
}

class Box3D extends Sheet2D {
    double height;

    void input3D(Scanner sc) {
        input2D(sc);
        System.out.print("Enter height (ft): ");
        height = sc.nextDouble();
    }

    double cost3D() {
        return length * width * height * 60;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box3D b = new Box3D();

        System.out.println("Enter dimensions for 3D Box:");
        b.input3D(sc);

        System.out.println("Cost of plastic box = Rs " + b.cost3D());
    }
}
