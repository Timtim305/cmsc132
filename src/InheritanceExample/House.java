package InheritanceExample;

public class House extends Building {
	int numOfBathrooms;
	int numOfBedrooms;
	int familyMembers;
	
	public House(){
		super("",0);
	}
	
	public House(String address, int numOfInhabitants, int bathrooms, int bedrooms, int family) {
		super(address, numOfInhabitants);
		this.numOfBathrooms = bathrooms;
		this.numOfBedrooms = bedrooms;
		this.familyMembers = family;
	}
	
	public int getBathrooms(){
		return numOfBathrooms;
	}
	
	public int getBedrooms(){
		return numOfBedrooms;
	}
	
	public int getCapacity(){
		return familyMembers;
	}
	
	
	
}
