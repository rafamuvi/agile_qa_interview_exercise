package com.exercise;

import com.helper.ReGex;

public class ConsonantCounter {
    // Trying different approaches from VoxelCounter class

    protected Integer countNumberOfConsonants(String input) {
        // Take parameter, put it on lower case and split it
        String[] lowerCaseInput = input.toLowerCase().split("");
        // Initialize counter
        var numOfConsonants = 0;
        // Iterate on each character and increment counter if consonant
        for (String character : lowerCaseInput) {
            // Did it thi way because I can take only consonants and discard digits, special characters, vowels, etc
            if (character.matches(ReGex.vowelRegex)) {
            } else if (character.matches(ReGex.alphabetRegex)) {
                ++numOfConsonants;
            } else {
            }
        }
        return numOfConsonants;
    }
}
