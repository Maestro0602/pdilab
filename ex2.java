class employee{
     String name;
    double salary;
    employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
}
double calculate_bonus(){
    return salary * 0.10;
}
}
class manager extends employee{
    manager(String name , double salary){
        super(name,salary);
    }
     @Override
    double calculate_bonus() {
        return salary * 0.2; 
    }
}
class intern extends employee {

    intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculate_bonus() {
        return salary * 0.05; 
    }
}

public class ex2 {
     public static void main(String[] args) {

        // Polymorphism: all references are Employee
        employee e1 = new employee("Puthirith", 3000);
        employee e2 = new manager("Lyda", 6000);
        employee e3 = new intern("Heang", 1500);

        System.out.println(e1.name + " bonus: " + e1.calculate_bonus());
        System.out.println(e2.name + " bonus: " + e2.calculate_bonus());
        System.out.println(e3.name + " bonus: " + e3.calculate_bonus());
    }
}
