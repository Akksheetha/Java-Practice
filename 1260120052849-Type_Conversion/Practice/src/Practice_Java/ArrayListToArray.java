package Practice_Java;
import java.util.*;
public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("Initial size of an ArrayList is "+arr.size());
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("After insert the size of the array is "+arr.size());
		System.out.println("Contents of ArraList "+arr);
		Integer ia[] = new Integer[arr.size()];
		ia = arr.toArray(ia);
		int sum = 0;
		for(int i : ia) {
			sum+=i;
		}
		System.out.println("Sum value is "+sum);
	}
}
