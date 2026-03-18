package Practice_Java;

import java.util.*;

class Mobile implements Comparable<Mobile>{
	private String name;
	private int ram;
	private int price;
	Mobile(String name, int ram, int price){
		this.name = name;
	    this.ram = ram;
		this.price = price;
	}
	String getName() {
		return name;
	}
	int getRam() {
		return ram;
	}
	int getPrice() {
		return price;
	}
	void setRam(int ram) {
		this.ram = ram;
	}
	void setName(String name) {
		this.name = name;
	}
	void setPrice(int price) {
		this.price = price;
	}
	public int compareTo(Mobile o) {
		if(this.ram > o.getRam()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
class PriceCompare implements Comparator<Mobile>{

	@Override
	public int compare(Mobile m1, Mobile m2) {
		// TODO Auto-generated method stub
		if(m1.getPrice()<m2.getPrice()) {
			return -1;
		}
		if(m1.getPrice()>m2.getPrice()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
class NameCompare implements Comparator<Mobile>{
	public int compare(Mobile m1, Mobile m2) {
		return m1.getName().compareTo(m2.getName());
	}
	
}

public class ComparatorUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(new Mobile("Redmi",16,800));
		mobileList.add(new Mobile("Apple",8,100));
		mobileList.add(new Mobile("Samsung",4,600));
		System.out.println("Sorted by Price");
		PriceCompare pc = new PriceCompare();
		Collections.sort(mobileList,pc);
		System.out.println("Mobiles after price sorting : ");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
		for(Mobile mb : mobileList) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
		}
	}

}
