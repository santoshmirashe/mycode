package com.me;

public class StringCalculator {

	public static final int add(final String numbers) {
		int result = 0;
		String[] numbersArray = numbers.split(",");
		int len = numbersArray.length;
		if (len > 2) {
			throw new RuntimeException("Max 2 number are allowed.");
		} else {
			// if String contains other than number 
			//then this method will throw exception and code will break.
			checkIfItsANumber(numbersArray);
		}
		return result;
	}

	private static void checkIfItsANumber(String[] numbersArray) {
		for (String number : numbersArray) {
			Integer.parseInt(number);
		}
	}

	public static void main(String[] args) {
		String str = "1,2";
		System.out.println(add(str));
	}
}
