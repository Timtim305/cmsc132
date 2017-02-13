package InheritanceExample;

public class Driver {

	public static void main(String[] args) {
		Building b = new House();
		System.out.println(b.numOfInhabitants);
		System.out.println(b.address);
		// we cannot access any of a House's fields here unless we cast
		
		
		System.out.println("---------------Break------------");
		
		House h = new House("UMD", 1000000, 1 , 3, 2);
	
		// what will this print out?
		System.out.println(h.getCapacity());
		


	}

}
