interface Gross {
    double calculateGrossSalary();
}

class Employee {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

class Salary extends Employee implements Gross {
    double basic, hra, da;

    Salary(String name, int empId, double basic, double hra, double da) {
        super(name, empId);
        this.basic = basic;
        this.hra = hra;
        this.da = da;
    }

    public double calculateGrossSalary() {
        return basic + hra + da;
    }

    void displaySalary() {
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Salary emp = new Salary("Amit", 201, 20000, 5000, 3000);
        emp.displayEmployee();
        emp.displaySalary();
    }
}
