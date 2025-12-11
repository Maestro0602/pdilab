import java.util.List;
public class ex06 {
    public static void main(String[] args) {
        shape circle = new circle(5.0);
        shape rec = new rec(4.0, 6.0);
        shape triangle = new triangle(3.0, 4.0);

        List<shape> shapes = new java.util.ArrayList<>();
        shapes.add(circle);
        shapes.add(rec);
        shapes.add(triangle);

        
        System.out.println("\nAreas with shape types:\n");
        System.out.printf("Circle: %.2f%n", circle.area());
        System.out.printf("Rectangle: %.2f%n", rec.area());
        System.out.printf("Triangle: %.2f%n", triangle.area());
        System.out.println("\n");
    }
}