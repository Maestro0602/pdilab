public class ex02 {

    static class Employee {
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public double calculateBonus() {
            return salary * 0.10;
        }
    }

    static class Manager extends Employee {
        public Manager(String name, double salary) {
            super(name, salary);
        }

        @Override
        public double calculateBonus() {
            return salary * 0.20;
        }
    }

    static class Intern extends Employee {
        public Intern(String name, double salary) {
            super(name, salary);
        }

        @Override
        public double calculateBonus() {
            return salary * 0.05;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Exercise 2: Method Overriding (Employee, Manager, Intern) ---");

        Employee emp = new Employee("Lyda", 50000);
        Manager mgr = new Manager("Vanheng", 80000);
        Intern intern = new Intern("Puthirith", 20000);

        System.out.println("Employee (" + emp.name + ") Bonus: $" + emp.calculateBonus());
        System.out.println("Manager (" + mgr.name + ") Bonus: $" + mgr.calculateBonus());
        System.out.println("Intern (" + intern.name + ") Bonus: $" + intern.calculateBonus());
    }
}