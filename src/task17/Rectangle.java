package task17;

public class Rectangle extends Shape{
    public Rectangle(double length, double width) {
        super(length, width);
    }
    @Override
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }
}
