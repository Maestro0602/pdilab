package Ex3;

// Base class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
    }
}

// Derived class
class Student extends Person {
    String student_id;

    Student(String name, String student_id) {
        super(name); // Call the constructor of Person
        this.student_id = student_id;
    }

    void displayStudentInfo() {
        System.out.println("Student ID: " + student_id);
    }
}

// Derived from Student
class OnlineStudent extends Student {
    String zoom_id;

    OnlineStudent(String name, String student_id, String zoom_id) {
        super(name, student_id); // Call the constructor of Student
        this.zoom_id = zoom_id;
    }

    void displayOnlineStudentInfo() {
        System.out.println("Zoom ID: " + zoom_id);
    }
}

// Test the multi-level inheritance
public class UniversityTest {
    public static void main(String[] args) {
        OnlineStudent onlineStudent = new OnlineStudent("Alice", "S12345", "Z98765");

        // Display all inherited info
        onlineStudent.displayPersonInfo();      // From Person
        onlineStudent.displayStudentInfo();     // From Student
        onlineStudent.displayOnlineStudentInfo(); // From OnlineStudent
    }
}

