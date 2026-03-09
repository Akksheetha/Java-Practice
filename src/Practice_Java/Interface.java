package Practice_Java;

interface Shape1 {
    double DEFAULT_VALUE = 1;
    double calculateArea();
    double calculatePerimeter();
    default String getDescription() {
        return "A Shape with unspecified dimensions";
    }
}
abstract class Circle1 implements Shape1 {
    private double radius;
    public Circle1(double radius) {
        this.radius = radius;
    }
    public Circle1() {
        this.radius = DEFAULT_VALUE;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public String getDescription() {
        return "Circle with radius " + radius;
    }
}
class Rectangle1 implements Shape1 {
    private double length;
    private double width;
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    public String getDescription() {
        return "Rectangle with length " + length + " and width " + width;
    }
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c = new Circle1(5);
	
//		Shape1 circle = new Circle1(5);
//        Shape1 rectangle = new Rectangle1(4, 6);
//        System.out.println(circle.getDescription());
//        System.out.println("Area: " + circle.calculateArea());
//        System.out.println("Perimeter: " + circle.calculatePerimeter());
//        System.out.println(rectangle.getDescription());
//        System.out.println("Area: " + rectangle.calculateArea());
//        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
	}

}
