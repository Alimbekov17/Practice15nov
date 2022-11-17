package task17;

public class Triangle extends Shape{
    private double thirdSide;
    public Triangle(double length, double width, double thirdSide) {
        super(length, width);
        this.thirdSide = thirdSide;
    }
    public double getThirdSide() {
        return thirdSide;
    }
    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }
    @Override
    public double getPerimeter() {
        return getThirdSide() + getLength() + getWidth();
    }
}
