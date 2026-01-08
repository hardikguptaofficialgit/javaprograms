import java.util.Scanner;

class Plate {
    double length, width;

    Plate(Scanner sc) {
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }
}

class Box extends Plate {
    double height;

    Box(Scanner sc) {
        super(sc);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }
}
class WoodBox extends Box {
    double thick;
    WoodBox(Scanner sc) {
        super(sc);
        System.out.print("Enter thickness: ");
        thick = sc.nextDouble();
    }
    void display() {
        System.out.println("The Dimensions are:-");
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Thickness = " + thick);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WoodBox wb = new WoodBox(sc);
        wb.display();
    }
}
