package Practice_Java;

public class MultipleGGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test<String,Integer,Float> obj = new Test<>("Java",1005.5f);
		Test<String, Integer, Float> obj = new Test<>("Java", 100, 5.5f);
		obj.print();
	}
}
class Test<T,U,R>{
	T ob1;
	U ob2;
	R ob3;
	Test(T ob1, U ob2, R ob3){
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
	}
	public void print() {
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}
}
