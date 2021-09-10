package fruitApp;

import java.util.Comparator;

public class Fruit {
	public Fruit(int no, String name, int price) {
		this.no = no;
		this.name = name.toString();
		this.price = price;
	}
	int no;
	String name;
	int price;
	
	public String toString() {
		return "Fruit [no=" + this.no + ", name=" + this.name + ", price=" + this.price + "]";
	}
}

class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class FruitComparatorDesc implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
	
}
