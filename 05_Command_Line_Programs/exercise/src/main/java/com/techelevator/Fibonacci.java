package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		String value = input.nextLine();

		int userLimit = 0;

		try{
			userLimit  = Integer.parseInt(value);
		}catch (NumberFormatException e){
			System.out.print("Invalid input");
			System.exit(0);
		}


		System.out.print("0, 1");

		int nextNum = 1;
		int previousNum = 1;

			//a=b+c
			//b=c
			//c=a
		while(nextNum < userLimit){
			System.out.print(", " + nextNum);
			int tempNum = nextNum + previousNum;
			nextNum = previousNum;
			previousNum = tempNum;


		}
		System.out.print(", " + value);

	}

}
