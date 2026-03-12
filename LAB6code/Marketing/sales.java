package Marketing;

import General.employee;

public class sales extends employee {

    public sales(int id, String name) {
        super(id, name);
    }

    public double tallowance(double totalEarning) {
        return 0.05 * totalEarning;
    }
}
