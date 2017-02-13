package LinkedListExamples;

public class LList<T> {
	LinkedNode head;
	LinkedNode tail;
	
	
	public class LinkedNode{
		T data;
		LinkedNode next;
		
		public LinkedNode(T data){
			this.data = data;
			next  = null;
		}
		
	}
	
	public LList(){
		head = null;
		tail = null;
	}
	

	
	
}