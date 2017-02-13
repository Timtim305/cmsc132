package DebuggerExample;

public class ArrayAverage {
	
	public static void main(String[] args){
		int[] a = new int[]{10, 5, 10, 5, 2, 4, 1};
		
		double result  = getAverage(a);
		
		System.out.println(result);
		
		
	}
	
	
	public static double getAverage(int[] arr){
		double total = 0;
		for(int i = 0; i < arr.length; i++){
			total += arr[i];
		}
		
		return total / arr.length;
	}
}
