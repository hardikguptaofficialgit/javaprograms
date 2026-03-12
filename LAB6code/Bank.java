class Bank {
    double principal = 1000; // non-static member

    // Static nested class
    static class InterestCalculator {

        static double calculateSimpleInterest(double p, double r, double t) {
            return (p * r * t) / 100;
        }

        void showMessage() {
            // Cannot access principal directly
            System.out.println("Static class cannot access non-static members directly.");
        }
    }

    public static void main(String[] args) {
        double si = InterestCalculator.calculateSimpleInterest(1000, 5, 2);
        System.out.println("Simple Interest: " + si);

        InterestCalculator ic = new InterestCalculator();
        ic.showMessage();
    }
}
