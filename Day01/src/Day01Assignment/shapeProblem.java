package Day01Assignment;

class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void draw(double radius) {
        System.out.println("Drawing Circle with radius " + radius);
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void draw(double length, double breadth) {
        System.out.println("Drawing Rectangle with length " + length + " and breadth " + breadth);
    }
}

public class shapeProblem {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Circle circle = new Circle();
        circle.draw();
        circle.draw(5.0);

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.draw(4.0, 3.0);
    }
}
