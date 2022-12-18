package com.exercise;

import jdk.jfr.Description;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class VowelCounterTest {
    /* This test is not needed anymore
    @Test
    @Description("Testing if getVowelListWithCount() return up to 4 words")
    public void returnVowelsCountWhenInsertedUpToForWords() {
        List<CountResult> expectedResult = Arrays.asList(
                new CountResult("cat", 1),
                new CountResult("dog", 1),
                new CountResult("catdog", 2),
                new CountResult("dogcat", 2));
        String[] args = new String[]{"cat", "dog", "catdog", "dogcat"};
        var res = counter.getVowelListWithCount(args);

        Assertions.assertNotNull(res, "Method 'VowelCounter().getVowelListWithCount(args)' returning null");
        Assertions.assertEquals(expectedResult.toString(), res.toString());
    }*/

    @Test
    @Description("Testing getVowelCount()")
    public void returnTheNumberOfVowelsInAWord() {
        var expectedResult = 4;

        /*// Copy private method to a new class, change access and use it
        Class A = VowelCounter.class;
        Object Obj = A.newInstance();
        Method method = A.getDeclaredMethod("getVowelCount", new Class[]{String.class});
        method.setAccessible(true);
        // Invoke copied private method
        var res = method.invoke(Obj, "Avocado");*/

        // With public access modifier
        var res = new VowelCounter().getVowelCount("Avocado");

        Assertions.assertEquals(expectedResult, res, String.format("Result should be %s but is %s", expectedResult, res));
    }

    @Test
    @Description("Testing getVowelCountNew()")
    public void returnTheNumberOfVowelsInAWordNew() {
        var expectedResult = 4;
        var res = new VowelCounter().getVowelCountNew("Avocado");

        Assertions.assertEquals(expectedResult, res, String.format("Result should be %s but is %s", expectedResult, res));
    }

}