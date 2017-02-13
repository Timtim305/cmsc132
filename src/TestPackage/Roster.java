package TestPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Roster implements Iterable<String> {
	ArrayList<String> students;
	
	public Roster(){
		students = new ArrayList<String>();
	}

	public Iterator<String> iterator() {
		return new Iterator<String>(){
			private int index = 0;
			
			public boolean hasNext() {
				return index < students.size();
			}

			public String next() {
				String name =  students.get(index);
				index++;
				return name;
			}
			
			public void remove(){
				return;
			}
		};
	}

	
}
