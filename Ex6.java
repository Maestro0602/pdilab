class Shape {
    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    private double side1, side2, side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("\n=== Exercise 6: Hierarchical Inheritance ===");

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4, 3, 4, 5)
        };

        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("Shape %d: Area = %.2f, Perimeter = %.2f%n",
                    i + 1, shapes[i].area(), shapes[i].perimeter());
        }
    }
}
