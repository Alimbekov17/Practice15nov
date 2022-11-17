package task17;

public class Cuboid extends Shape{
    private double height;
    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getPerimeter() {
        return 4 * (getHeight() + getLength() + getWidth());
    }
}
