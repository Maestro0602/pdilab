class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double w, h;
    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }
    double area() {
        return w * h;
    }
}

class Triangle extends Shape {
    double b, h;
    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }
    double area() {
        return 0.5 * b * h;
    }
}

public class ex6 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 8)
        };

        for (Shape s : shapes) {
            System.out.println(s.area());
        }
    }
}
