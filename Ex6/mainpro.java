
package Ex6;

public class mainpro {
    public static void main(String[] args) {
        // Create different shape objects
        shapes circle = new circle(5.0);
        shapes rectangle = new rec(4.0, 6.0);
        shapes triangle = new triangle(3.0, 4.0);
        
        // Store shapes in a list
        java.util.List<shapes> shapes = new java.util.ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
        
        // Print areas of all shapes
        System.out.println("Areas of different shapes:");
        for (shapes shape : shapes) {
            System.out.printf("Area: %.2f%n", shape.area());
        }

        }    
    }