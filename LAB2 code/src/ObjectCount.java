public class ObjectCount {
    static int count = 0;

    ObjectCount() {
        count++;
    }

    static void displayCount() {
        System.out.println("Number of objects created = " + count);
    }

    public static void main(String[] args) {
        // No scanner required (objects are not user input)
        ObjectCount o1 = new ObjectCount();
        ObjectCount o2 = new ObjectCount();
        ObjectCount o3 = new ObjectCount();

        ObjectCount.displayCount();
    }
}
