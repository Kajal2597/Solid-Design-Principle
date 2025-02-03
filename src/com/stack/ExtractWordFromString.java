package com.stack;

import com.stack.Program;
//Extract word from continuous string
public class ExtractWordFromString {
    public static void main(String[] args) {
        // Original continuous string
        String originalString = "ThisIsAContinuousStringWithSpecificWordInside";

        // Define the word you want to extract
        String wordToExtract = "SpecificWord";

        // Find the starting index of the word
        int startIndex = originalString.indexOf(wordToExtract);
        System.out.println(startIndex);

        // Check if the word is found in the original string
        if (startIndex != -1) {
            // Calculate the ending index of the word
            int endIndex = startIndex + wordToExtract.length();

            // Extract the word using substring()
            String extractedWord = originalString.substring(startIndex, endIndex);

            // Copy the word to another string
            String copiedString = extractedWord;

            // Output the result
            System.out.println("Extracted word: " + copiedString);
        } else {
            System.out.println("Word not found in the original string.");
        }
    }
}

