package swing;

class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }

    // Other common methods and attributes can be added here.
}

class Manager extends Employee {
    private double salary;

    public Manager(String name, int employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: $" + salary);
    }
}

class Programmer extends Employee {
    private double hourlyRate;

    public Programmer(String name, int employeeId, double hourlyRate) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hourly Rate: $" + hourlyRate);
    }
}

public class EmployeeSalaryExample {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 1001, 60000.0);
        Programmer programmer = new Programmer("Alice Smith", 1002, 30.0);

        System.out.println("Manager's Info:");
        manager.displayInfo();

        System.out.println("\nProgrammer's Info:");
        programmer.displayInfo();
    }
}
