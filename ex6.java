class Shape {
    double area() {
        return 0;
    }

    void display() {
        System.out.println("Area: " + area());
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }

    @Override
    void display() {
        System.out.println("Circle (radius: " + r + ") -> Area = " + area());
    }
}

class Rectangle extends Shape {
    double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    double area() {
        return w * h;
    }

    @Override
    void display() {
        System.out.println("Rectangle (" + w + " x " + h + ") -> Area = " + area());
    }
}

class Triangle extends Shape {
    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    double area() {
        return 0.5 * b * h;
    }

    @Override
    void display() {
        System.out.println("Triangle (base: " + b + ", height: " + h + ") -> Area = " + area());
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
            s.display(); // cleaner display
        }
    }
}
