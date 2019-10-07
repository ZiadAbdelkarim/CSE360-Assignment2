/* Ziad Abdelkarim
 * CSE360 Wed 1030
 * Assignment 2
 * This class is intended to hold an int variable and manipulate it through addition or 
 * subtraction via the underlying methods.
 */

package cse360assign2;

public class AddingMachine {
	
	private int total;
	private String history;
	
	/*
	 * Class Constructor
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0"; 
	}
	
	/*
	 * Returns the total int variable 
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 *  Adds the passed parameter to the total variable 
	 */
	public void add (int value) {
		total += value; 
		history += " + " + value;
	}
	
	/*
	 * Subtracts the passed parameter from the total variable
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/*
	 * Returns the total variable as a string of all manipulations to the original value 0
	 */
	public String toString () {
		return history;
	}
	
	/*
	 * Changes the value of the total variable to 0
	 */
	public void clear() {
		total = 0;
		history = "0"; 
	}
	
}