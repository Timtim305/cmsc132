package TestPackage;

//**********************************************
// Change.java
// Written by Ninad Nirgudkar
// Date: February 2nd, 2017
//**********************************************

import java.util.Scanner;

public class Change
{

	public static void main(String[] args)
	{
	
	//Retrieve input from the user
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the total amount due in pennies: ");
	int amountdue = input.nextInt();
	System.out.println("Please enter the amount received from the customer in pennies: ");
	int amountpaid = input.nextInt();

	//Compute the balance
	int balance = amountpaid - amountdue;
	
	//Compute the change the customer is due
	int dollars = balance/100;
	balance = balance - (100*dollars);

	int quarters = balance/25;
	balance = balance - (25*quarters);

	int dimes = balance/10;
	balance = balance - (10*dimes);

	int pennies = balance/1;
	balance = balance - (balance*1);

	//Display the amount due to the user
	System.out.println("The amount due to the user is: " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, and " + pennies + " pennies.");

	} //Ending the method

} //Ending the class
	
	
	