package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner hamlet = new Scanner(new File("hamlet.txt"));

        Set<String> hamletTextHash = new HashSet<String>();
        Set<String> hamletTextTree = new TreeSet<String>();
        Map<String, Integer> hamletMap = new HashMap<String, Integer>();

        while (hamlet.hasNext()){
            String word = hamlet.next().toLowerCase().replaceAll("[^a-z, ^0-9, ^']", "");
            if(hamletMap.containsKey(word)){
                int countTotal = hamletMap.get(word);
            }
        }
        System.out.println("Number of unique words in Hamlet: " + hamletTextTree.size());
        System.out.println();
        //searchFeature(userInput, hamletTextHash);
    }

    public static void searchFeature(Set<String> hamletText){
        Scanner userInput = new Scanner(System.in);

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

}
