package Practice_Java;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk = new Stack<>();
		stk.push("A");
		stk.push("B");
		stk.push("C");
		stk.push("D");
		System.out.println("Elements in the stack "+stk);
		System.out.println("Size of the stack is "+stk.size());
		stk.pop();
		System.out.println("Elements in the stack after remove "+stk);
		System.out.println("Size o the stack after remove is "+stk.size());
	}

}
