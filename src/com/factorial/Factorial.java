//Find factorial of a given number
package com.factorial;

public class Factorial {
	
	long fact=1; //Initialize factorial value
	
	public int getFactorial(int number) throws InvalidInputException,FactorialException {
		
		if(number<2)  //Throw exception if number is less than 2
			throw new InvalidInputException("Number cannot be less than 2");
		
		for(int i=1;i<=number;i++) //Compute factorial value
			fact=fact*i;
		
		if(fact>Integer.MAX_VALUE)  //Throw exception if factorial is greater than size of 'int'
			throw new FactorialException("Factorial cannot be more than 2,147,483,647");
		
		return (int)fact;
	}
}

