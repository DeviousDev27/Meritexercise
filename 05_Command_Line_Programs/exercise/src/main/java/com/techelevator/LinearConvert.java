package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.print("Please enter the length: ");
		String value = input.nextLine();
		int lengthInput = Integer.parseInt(value);

		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		char convertInput = input.nextLine() . charAt(0);

		if(convertInput == 'f'){
			double meterConvert = lengthInput * 0.3048;
			System.out.println(lengthInput +"f" +  " is " + meterConvert + "m");
		}else if (convertInput == 'm'){
			double feetConvert = (int) lengthInput * 3.2808399;
			System.out.println(lengthInput +"m" +  " is " + feetConvert + "f");

		}else {
			System.out.println("Invalid");
		}


	}

}
