package Practice_Java;
import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("c");
		pq.add("b");
		pq.add("a");
		pq.add("e");
		pq.add("f");
		pq.add("d");
		System.out.println("Elements in the priority Queue ");
		while(!pq.isEmpty()) {
			System.out.print(pq.poll()+" ");
		}
	}
}
