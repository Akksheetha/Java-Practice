package Practice_Java;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("Initial Size of ArrayList is "+arr.size());
		arr.add("C");
		arr.add("A");
		arr.add("E");
		arr.add("B");
		arr.add("D");
		arr.add("F");
		arr.add(1,"G");
		System.out.println("After insert the Size of ArrayList is "+arr.size());
		System.out.println("Contents of the ArrayList "+arr);
		arr.remove("F");
		arr.remove(2);
		System.out.println("Contents of the arrayList "+arr);
	}

}
