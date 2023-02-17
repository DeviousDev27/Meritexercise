package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("What is the destination file?");
		String destinationFile = userInput.nextLine();

		File dateOutput = new File(destinationFile);

		try(PrintWriter numberWriter = new PrintWriter(dateOutput)){

			for(int i = 1; i <= 300; i++){
				if(i % 3 == 0 && i % 5 == 0){
					numberWriter.println("FizzBuzz");
				}else if(i % 3 == 0){
					numberWriter.println("Fizz");
				}else if(i % 5 == 0 ){
					numberWriter.println("Buzz");
				}else {
					numberWriter.println(i);
				}
			}

		}catch (FileNotFoundException e){
			System.out.println("File not found: " + dateOutput.getAbsolutePath());
		}

	}

}
