class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public String getInfo() {
        return String.format("%s: Salary $%.2f, Bonus $%.2f",
                name, salary, calculateBonus());
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }

    private double getSalary() {

        return super.calculateBonus() * 2;
    }
}

class Intern extends Employee {
    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.05;
    }

    private double getSalary() {
        return super.calculateBonus() / 0.10;
    }
}

public class ex02 {
    public static void main(String[] args) {
        System.out.println("\n=== Exercise 2: Employee & Manager ===");

        Employee emp1 = new Employee("John Doe", 50000);
        Employee emp2 = new Manager("Jane Smith", 80000);
        Employee emp3 = new Intern("Bob Wilson", 30000);

        System.out.println(emp1.getInfo());
        System.out.println(emp2.getInfo());
        System.out.println(emp3.getInfo());
    }
}
