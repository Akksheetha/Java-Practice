package Practice_Java;

class OuterClass{
	int age = 18;
	public void checkAge() {
		System.out.println("The checkAge() Method call");
	}
	class InnerClass{
		public void show() {
			System.out.println("In show() method call of inner class");
		}
	}
}
public class InnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass();
		System.out.println("OuterClass method call");
		outer.checkAge();
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println("InnerClass method call");
	}

}
