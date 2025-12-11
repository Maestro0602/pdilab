class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "Name: " + name;
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getInfo() {
        return "Name: " + getName() + ", Student ID: " + studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}

class OnlineStudent extends Student {
    private String zoomId;

    public OnlineStudent(String name, String studentId, String zoomId) {
        super(name, studentId);
        this.zoomId = zoomId;
    }

    @Override
    public String getInfo() {
        return "Name: " + getName() + ", Student ID: " + getStudentId() +
                ", Zoom ID: " + zoomId;
    }
}

public class ex03 {
    public static void main(String[] args) {
        System.out.println("\n=== Exercise 3: Multi-Level Inheritance ===");

        Person person = new Person("Alice Johnson");
        Student student = new Student("Bob Smith", "S12345");
        OnlineStudent onlineStudent = new OnlineStudent("Carol Davis", "S67890", "zoom123");

        System.out.println(person.getInfo());
        System.out.println(student.getInfo());
        System.out.println(onlineStudent.getInfo());
    }
}