package Practice_Java;

class Person{
	private String name;
	private String address;

	Person(String name, String address){
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Person[name=" + name + ", address=" + address + "]";
	}
}

class Student extends Person{
	private String program;
	private int year;
	private double fee;

	Student(String name, String address, String program, int year, double fee){
		super(name,address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String toString() {
		return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
}

class Staff extends Person{
	private String school;
	private double pay;

	Staff(String name, String address, String school, double pay){
		super(name,address);
		this.school = school;
		this.pay = pay;
	}

	public String toString() {
		return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
	}
}

public class TestPerson {

	public static void main(String[] args) {

		Student s = new Student("Ram","Chennai","CS",2,50000);
		Staff st = new Staff("Ravi","Madurai","ABC School",35000);

		System.out.println(s);
		System.out.println(st);
	}
}