class Fruit {
    void show() {
        System.out.println("This is Fruit class");
    }
}
class Banana extends Fruit {
    void show() {
        System.out.println("This is Banana class");
    }
}
class Cherry extends Fruit {
    void show() {
        System.out.println("This is Cherry class");
    }
}
public class FruitTest {
    public static void main(String[] args) {
        Fruit a = new Fruit();
        Banana b = new Banana();
        Cherry c = new Cherry();
        a.show();
        b.show();
        c.show();
    }
}
