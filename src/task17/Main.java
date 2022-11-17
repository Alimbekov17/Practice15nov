package task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose the Shape to find perimeter:
                
                (circle)
                (trapezium)
                (cuboid)
                (rectangle)
                (triangle)
                
                enter:""");
        String shape = scanner.next();

        switch (shape) {
            case "circle" -> {
                System.out.println("Enter radius of the circle: ");
                Shape circle = new Circle(scanner.nextDouble());
                System.out.println("Perimeter of the circle is: " + ((double) Math.round(circle.getPerimeter() * 100) / 100));
            }
            case "trapezium" -> {
                System.out.println("Enter 4 sides of the trapezium: ");
                Shape trapezium = new Trapezium(scanner.nextDouble(),
                        scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                System.out.println("Perimeter of the trapezium is: " + trapezium.getPerimeter());
            }
            case "cuboid" -> {
                System.out.println("Enter length, width and height of cuboid: ");
                Shape cuboid = new Cuboid(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                System.out.println("Perimeter of the cuboid is: " + cuboid.getPerimeter());
            }
            case "rectangle" -> {
                System.out.println("Enter length and width of the rectangle: ");
                Shape rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                System.out.println("Perimeter of the rectangle is: " + rectangle.getPerimeter());
            }
            case "triangle" -> {
                System.out.println("Enter 3 sides of the triangle: ");
                Shape triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                System.out.println("Perimeter of the triangle is: " + triangle.getPerimeter());
            }
            default -> System.out.println("there is no such shape");
        }

    }
}
