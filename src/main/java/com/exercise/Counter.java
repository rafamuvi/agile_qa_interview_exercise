package com.exercise;

import javax.lang.model.type.ExecutableType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Counter {

    protected List<CountResultRecord> counter = new ArrayList<>();

    public List<CountResultRecord> countNumberOfConsonantsAndVowelsForEachWordInList(String[] args) {
        Arrays.stream(args).forEach(arg -> counter.add(
                new CountResultRecord(
                        arg,
                        new VowelCounter().getVowelCountNew(arg),
                        new ConsonantCounter().countNumberOfConsonants(arg)
                )
        ));
        return counter;
    }

}
