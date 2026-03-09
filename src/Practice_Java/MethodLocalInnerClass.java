package Practice_Java;

class Outer{
	int value = 56;
	public void OuterClassMethod() {
		System.out.println("Inside the method of Outer class");
		class Inner{
			public void InnerClassMethod() {
				System.out.println("Inside the method of inner class");
				System.out.println("Value: "+value);
			}
		}
		Inner inner = new Inner();
		inner.InnerClassMethod();
	}
}
public class MethodLocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.OuterClassMethod();
	}

}
