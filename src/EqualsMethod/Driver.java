package EqualsMethod;

public class Driver {

	public static void main(String[] args) {
		Laptop a = new Laptop("sku","Dell");
		Laptop b = new Laptop("sku", "Dell");
		
		System.out.println("a and b being equal is: " + a.equals(b));
		System.out.println(a.getClass());
		System.out.println(b.getClass());
		
		System.out.println("----------BREAK------------");
		Notebook n = new Notebook("sku","Dell");
		System.out.println("a and n being equal is: " + a.equals(n));
		System.out.println("Calling the Notebook equals method...: " + n.equals(a));
		
		System.out.println(a.getClass());
		System.out.println(n.getClass());

	}

}
