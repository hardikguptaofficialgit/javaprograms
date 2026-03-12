package General;

public class employee {
    protected int empid;
    private String ename;

    public employee(int id, String name) {
        empid = id;
        ename = name;
    }

    public double earnings(double basic) {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    public int getEmpId() {
        return empid;
    }
}
