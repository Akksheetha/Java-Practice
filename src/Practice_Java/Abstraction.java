package Practice_Java;

abstract class Shape{
	void draw() {
		System.out.println("drawing..");
	}
	abstract void area();
	abstract void perimeter();
}
class Rectangle extends Shape{
	private int length, breadth;
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
    void area(){
    	System.out.println("Area of Rectangle: "+(length*breadth));
    }
    void perimeter() {
    	System.out.println("Perimeter of Rectangle: "+(2*(length*breadth)));
    }
}
class Square extends Shape{
	private int side;
	Square(int side){
		this.side = side;
	}
	void area() {
		System.out.println("Area of the square is: "+(side*side));
	}
	void perimeter() {
		System.out.println("Perimeter of the square is: "+(4*side));
	}
}
class Circle extends Shape{
	private int radius;
	Circle(int radius){
		this.radius = radius;
	}
	void area() {
		System.out.println("Area of the circle is: "+(3.14*radius*radius));
	}
	void perimeter() {
		System.out.println("Perimeter of the circle is: "+(2*3.14*radius));
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s = new Rectangle(3,5);
		s.area();
		s.perimeter();
		s = new Square(5);
		s.area();
		s.perimeter();
		s = new Circle(3);
		s.area();
		s.perimeter();
	}


}
