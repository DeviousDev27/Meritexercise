package com.techelevator;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the temperature: ");
		String value = input.nextLine();
		int temperatureStart = Integer.parseInt(value);

		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		char convertInput = input.nextLine().charAt(0);


		if(convertInput == 'F'){
			double tempCelsius = (temperatureStart - 32) / 1.8;
			System.out.println(temperatureStart +"F" +  " is " + tempCelsius + "C");
		}else if (convertInput == 'C'){
			double tempFarenheit = temperatureStart * 1.8 + 32;
			System.out.println(temperatureStart +"C" +  " is " + tempFarenheit + "F");

		}else {
			System.out.println("Invalid");
		}




	}

}
