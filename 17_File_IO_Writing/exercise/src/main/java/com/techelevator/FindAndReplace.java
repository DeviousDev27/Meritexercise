package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();

        System.out.println("What is the source file?");
        String sourcePath = userInput.nextLine();

        System.out.println("What is the destination file?");
        String destinationPath = userInput.nextLine();

        File dataPath = new File(sourcePath);
        File dataOuptut = new File(destinationPath);


        try(Scanner fileSearch = new Scanner(dataPath); PrintWriter writerPath = new PrintWriter(dataOuptut)){

            while(fileSearch.hasNextLine()) {

                String currentLine = fileSearch.nextLine();

                writerPath.println(currentLine.replace(searchWord,replacementWord));


            }

        }catch (FileNotFoundException e){
            System.out.println("File not found: " + dataPath.getAbsolutePath());
        }

    }

}
