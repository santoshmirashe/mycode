package com.me;

public class StringCalculator {

	public static final int add(final String numbers) {
		// regex changed and added newline also in split
		String delimiter = ",|n";
		String modifiedNumbersSting = numbers;
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("//") + 2;
			delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
			modifiedNumbersSting = numbers.substring(numbers.indexOf("n") + 1);
		}
		String[] numbersArray = modifiedNumbersSting.split(delimiter);
		return add(modifiedNumbersSting, numbersArray);
	}

	private static int add(String numbersString, String[] numbersArray) {
		// this method will return 0 if the string is empty else it will add the
		// numbers
		int result = 0;
		int numberIntValue = 0;
		if (!numbersString.trim().isEmpty()) {
			for (String number : numbersArray) {
				if (!number.trim().isEmpty()) {
					numberIntValue = Integer.parseInt(number.trim());
					if (numberIntValue < 0) {
						throw new RuntimeException(
								"Negative numbers are not allowed : "
										+ numberIntValue);
					} else if (numberIntValue <= 1000) {
						result += numberIntValue;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "//�:n1�2�3";
		System.out.println(add(str));
	}
}
