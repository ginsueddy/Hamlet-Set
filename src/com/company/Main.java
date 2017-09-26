package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner hamlet = new Scanner(new File("/Users/ginsueddy/Desktop/github/Hamlet-Set/src/com/company/hamlet.txt"));
        Scanner userInput = new Scanner(System.in);

        Set<String> hamletText = new HashSet<String>();

        while (hamlet.hasNext()){
            String word = hamlet.next().toLowerCase();
            hamletText.add(word);
        }
        System.out.println("Number of unique words in Hamlet: " + hamletText.size());
        System.out.println();
        searchFeature(userInput, hamletText);
    }

    public static void searchFeature(Scanner userInput, Set<String> hamletText){
        while (true){
            System.out.print("Give me a word and I will see if it is in Hamlet. > ");
            String userWord = userInput.next();
            if(hamletText.contains(userWord.toLowerCase())){
                System.out.println(userWord + " is in Hamlet!");
            }
            else {
                System.out.println(userWord + " is not in Hamlet.");
            }

        }
    }

    public static void getDirectory(File hamlet){
        //use this method to grab the directory of hamlet.txt if the directory changes when different computer is used
        try {
            System.out.println(hamlet.getCanonicalPath());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
