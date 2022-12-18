package com.exercise;

public record CountResultRecord(String word, Integer vowelCount, Integer consonantCount) {
    @Override
    public String toString() {
        return "CountResultRecord{" +
                "word='" + word + '\'' +
                ", vowelCount=" + vowelCount +
                ", consonantCount=" + consonantCount +
                '}';
    }
}
