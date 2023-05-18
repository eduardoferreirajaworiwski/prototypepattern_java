package prototype_java;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";

    }

    @Override

    public void draw() {
        System.out.println("Inside rectangle:: draw() method");
    }
}
