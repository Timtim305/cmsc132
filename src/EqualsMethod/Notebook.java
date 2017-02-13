package EqualsMethod;

public class Notebook extends Laptop{
	public Notebook(String make, String model){
		super(make, model);
	}
	
	public boolean equals(Object other){
		if (this == other){
			return true;
		}
		
		if(other == null){
			return false;
		}
		
		if(!this.getClass().equals(other.getClass())){
			return false;
		}
		
		Notebook oth = (Notebook) other;
		
		return this.SKU.equals(oth.SKU) && this.brand.equals(oth.brand);
	}
}
