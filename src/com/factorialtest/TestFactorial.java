//Test the Factorial class
package com.factorialtest;

import java.util.Scanner;
import com.factorial.Factorial;
import com.factorial.FactorialException;
import com.factorial.InvalidInputException;

public class TestFactorial {

	public static void main(String[] args) {
		Factorial factorial= new Factorial();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number=scanner.nextInt(); //Input a number
		
		scanner.close();
		
		//Display factorial value
		try {
			int fact=factorial.getFactorial(number);
			System.out.println("Factorial of "+number+" is "+fact);
		} catch(InvalidInputException iie) {
			iie.printStackTrace();
		} catch(FactorialException fe) {
			fe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}