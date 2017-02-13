package InheritanceExample;

public class Hut extends House{
	public Hut(){
		super("UMD", 1000000, 1 , 3, 2);
	}
	
	public int getNum(){
		return super.getCapacity();
	}
}
