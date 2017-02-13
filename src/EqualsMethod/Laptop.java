package EqualsMethod;

public class Laptop {
	String SKU;
	String brand;
	
	public Laptop(String model, String brand){
		SKU = model;
		this.brand = brand;
	}
	
	public boolean equals(Object other){
		if(this == other){
			return true;
		}
		
		if(!(other instanceof Laptop)){
			return false;
		}
		
		Laptop otherLaptop = (Laptop) other;
		
		return this.SKU.equals(otherLaptop.SKU) && this.brand.equals(otherLaptop.brand);
		
	}
}
