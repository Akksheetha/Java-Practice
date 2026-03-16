package Practice_Java;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<>();
		System.out.println("Size of the vector is "+v.size());
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		System.out.println("Elements in the vector "+v);
		System.out.println("Size o the vector is "+v.size());
		System.out.println("capacity of the vector is "+v.capacity());
		v.remove(3);
		System.out.println("Elements after deletion "+v);
	}

}
