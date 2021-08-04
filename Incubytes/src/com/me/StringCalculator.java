package com.me;

public class StringCalculator {

	public static final int add(final String numbers) {
		String[] numbersArray = numbers.split(",");
		int result = add(numbers, numbersArray);
		return result;
	}

	private static int add(String numbersString, String[] numbersArray) {
		// this method will return 0 if the string is empty else it will add the
		// numbers
		int result = 0;
		if (!numbersString.trim().isEmpty()) {
			for (String number : numbersArray) {
				if (!number.trim().isEmpty()) {
					result += Integer.parseInt(number);
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
