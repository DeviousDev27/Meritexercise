package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input =new Scanner(System.in);
		System.out.println("What is the search file you are looking for?");
		String filePath = input.nextLine();
		//specific word search in file
		System.out.println("What is the search word you are looking for?");
		String wordSearch = input.nextLine();
		System.out.println("Should the search be case sensitive? (Y\\N)");
		String answer = input.next();


		File dataFile = new File(filePath);

		int lineCounter = 0;

		try(Scanner fileInput = new Scanner(dataFile)){
			if (answer.contains("Y")) {
				while (fileInput.hasNextLine()) {
					String lineOfText = fileInput.nextLine();
					lineCounter++;

					if (lineOfText.contains(wordSearch)) {
						System.out.println(lineCounter + ") " + lineOfText);
					}
				}
			}while (fileInput.hasNextLine()) {
				String lineOfText = fileInput.nextLine();
				lineCounter++;

				if (lineOfText.toLowerCase().contains(wordSearch)) {
					System.out.println(lineCounter + ") " + lineOfText);
				}
			}

		}catch (FileNotFoundException e){
			System.out.println("This file not found " + dataFile.getAbsolutePath());
		}




	}

}
