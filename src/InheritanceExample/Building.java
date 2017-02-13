package InheritanceExample;

public class Building{
	String address;
	int numOfInhabitants;
	
	public Building(String address, int numOfInhabitants){
		this.address = address;
		this.numOfInhabitants = numOfInhabitants;
	}
	
	public String getAddress(){
		return address;
	}
	
	public int getCapacity(){
		return numOfInhabitants;
	}
}
