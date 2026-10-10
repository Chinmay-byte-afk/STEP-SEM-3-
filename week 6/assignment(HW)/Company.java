public class Company {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Company(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        Company e1 = new Company("Rahul", 40000);
        Company e2 = new Company("Priya", 50000);
        Company e3 = new Company("Aman", 45000);

        Company.printCompanyInfo();
    }
}