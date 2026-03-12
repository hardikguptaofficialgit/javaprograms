import java.util.Scanner;
import Marketing.sales;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee id and employee name: ");
        int id = sc.nextInt();
        String name = sc.next();

        System.out.print("Enter the basic salary: ");
        double basic = sc.nextDouble();

        sales s = new sales(id, name);
        double total = s.earnings(basic);

        System.out.println("The emp id of the employee is " + s.getEmpId());
        System.out.println("The total earning is " + total);
    }
}
