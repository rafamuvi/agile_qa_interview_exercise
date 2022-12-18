package com.exercise;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class ConsonantCounterTest extends ConsonantCounter {

    @Test
    public void testIfReturnThreeConsonants() {
        String[] words = new String[]{"  word  ", "word/", "@+'098word", "{[(/123word"};
        Integer expRes = 3;
        Arrays.stream(words).forEach(word -> {
            Integer actRes = countNumberOfConsonants(word);
            Assertions.assertEquals(expRes, actRes,
                    String.format("Result should be %d but got %d", expRes, actRes));
        });
    }
}