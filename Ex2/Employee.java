package Ex2;

public class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }


    public double calculate_bonus(){
        return this.salary * 0.1;
    }
    
}
