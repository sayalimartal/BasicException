//Exception if input number is greater than size of 'int'
package com.factorial;

public class FactorialException extends Exception {
	public FactorialException(String message) {
		super(message);
	}

}
