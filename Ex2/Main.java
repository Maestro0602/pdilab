package Ex2;

public class Main {
    public static void main(String[] args){
        //Polymorphism method
        //Java still calls the correct overriden class, based on the actual object type at runtime;
        Employee E = new Employee("Heang",20);
        Employee M = new Manager("Heng", 30);
        Employee I = new Intern("Lyda", 40);

        
        E.calculate_bonus();
        System.out.println(E.name + " bonus: $" + E.calculate_bonus());
        System.out.println(M.name + " bonus: $" + M.calculate_bonus());
        System.out.println(I.name + " bonus: $" + I.calculate_bonus());
    }
    
}
