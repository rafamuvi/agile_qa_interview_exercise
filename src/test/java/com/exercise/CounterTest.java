package com.exercise;

import jdk.jfr.Description;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest extends Counter{

    @Test
    @Description("Return a list of words with number of vowels and consonants on each")
    public void returnListOfWordsWithNumberOfVowelsAndConsonants() {
        List<CountResultRecord> expectedResult = Arrays.asList(
                new CountResultRecord("cat", 1, 2),
                new CountResultRecord("dog", 1, 2),
                new CountResultRecord("catdog", 2, 4),
                new CountResultRecord("dogcat", 2, 4));

        String[] args = new String[]{"cat", "dog", "catdog", "dogcat"};
        List<CountResultRecord> actualResult = new Counter().countNumberOfConsonantsAndVowelsForEachWordInList(args);

        Assertions.assertNotNull(actualResult);
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

}