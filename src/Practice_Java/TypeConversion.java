package Practice_Java;

public class TypeConversion {
		public static void main(String[] args) {
		int i = 100;
		long l = i; // automatic type conversion
		float f = l; // automatic type conversion
		System.out.println("Int value "+i);
		System.out.println("Long value "+l);
		System.out.println("Float value "+f);
        //Explicit conversion
		double d = 100.04;
		long a = (long)d; //convert double into long
		int b = (int)a; // long convert into int
		System.out.println("Double value "+d);

		}
}
