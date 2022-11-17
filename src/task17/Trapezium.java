package task17;

public class Trapezium extends Shape{
    private double base;
    private double side;

    public Trapezium(double length, double width, double base, double side) {
        super(length, width);
        this.base = base;
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return getBase() + getSide() + getLength() + getWidth();
    }
}
