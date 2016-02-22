
package cse360assign3;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return 0;
	}
	
	public int add (int value) {
		 return value + total;
	}
	
	public int subtract (int value) {
		return total - value;
	}
	
	public int multiply (int value) {
		return total * value;
	}
	
	public int divide (int value) {
		
		return total / value;
		
	}
	
	public String getHistory () {
		return "";
	}
}
