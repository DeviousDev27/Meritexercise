package com.techelevator;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String inputToConvert = input.nextLine();
		String[] decNums = inputToConvert.split(" ");


		for(String decimalNum : decNums){
			String binaryString = convertToBinary(decimalNum);
			System.out.println(decimalNum + " in binary is " + binaryString);
		}


	}

	public static String convertToBinary (String x){
		int decimalConvert = Integer.parseInt(x);
		return Integer.toBinaryString(decimalConvert);
	}

}
