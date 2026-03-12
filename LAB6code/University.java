class University {
    String universityName;
    String location;

    // Inner class
    class Department {
        String deptName;
        String hodName;

        void display() {
            System.out.println("University: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department: " + deptName);
            System.out.println("HOD: " + hodName);
        }
    }

    University(String name, String loc) {
        universityName = name;
        location = loc;
    }

    void createDepartment(String dname, String hod) {
        Department d = new Department(); // object of inner class
        d.deptName = dname;
        d.hodName = hod;
        d.display();
    }

    public static void main(String[] args) {
        University u = new University("KIIT", "Bhubaneswar");
        u.createDepartment("CSE", "Dr. Das");
    }
}
