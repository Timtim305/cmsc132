package TestPackage;

import java.util.ArrayList;

public class Test {

	
	public static void main(String[] args){
		ArrayList<String> s = new ArrayList<String>();
		if (s.isEmpty()){
			throw new IllegalArgumentException();
		}
	}
}
