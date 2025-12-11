public class ex03 {

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }
    }

    static class Student extends Person {
        String studentId;

        public Student(String name, String studentId) {
            super(name);
            this.studentId = studentId;
        }
    }

    static class OnlineStudent extends Student {
        String zoomId;

        public OnlineStudent(String name, String studentId, String zoomId) {
            super(name, studentId);
            this.zoomId = zoomId;
        }

        public void displayDetails() {
            System.out.println("Online Student Details:");
            System.out.println("  Name (from Person): " + name);
            System.out.println("  Student ID (from Student): " + studentId);
            System.out.println("  Zoom ID: " + zoomId);
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Exercise 3: Multi-Level Inheritance (Person -> Student -> OnlineStudent) ---");
        
        OnlineStudent onlineStudent = new OnlineStudent("Jane Doe", "S98765", "jane.doe@zoom");
        onlineStudent.displayDetails();
    }
}