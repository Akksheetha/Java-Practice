package Practice_Java;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		System.out.println("Size at the beginning "+list.size());
		list.add("Java");
		list.add("C++");
		list.add("JavaScript");
		list.addFirst("C#");
		list.addLast("Kotlin");
		list.add(2,"Python");
		System.out.println("Original LinkedList "+list);
		System.out.println("Size after addition "+list.size());
		list.remove(5);
		list.remove("C#");
		System.out.println("New LinkedList "+list);
		System.out.println("Final size of the LinkedList is "+list.size());
	}

}
