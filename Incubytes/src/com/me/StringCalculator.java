package com.me;

public class StringCalculator {

	public static final int add(final String numbers) {
		//regex changed and added newline also in split
		String delimiter = ",|n";
	    String modifiedNumdersSting = numbers;
	    if (numbers.startsWith("//")) {
	        int delimiterIndex = numbers.indexOf("//") + 2;
	        delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
	        modifiedNumdersSting = numbers.substring(numbers.indexOf("n") + 1);
	    }
	    String [] numbersArray = modifiedNumdersSting.split(delimiter);
	    return add(modifiedNumdersSting, numbersArray);
	}

	private static int add(String numbersString, String[] numbersArray) {
		// this method will return 0 if the string is empty else it will add the
		// numbers
		int result = 0;
		if (!numbersString.trim().isEmpty()) {
			for (String number : numbersArray) {
				if (!number.trim().isEmpty()) {
					result += Integer.parseInt(number.trim());
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "1,2";
		System.out.println(add(str));
	}
}
