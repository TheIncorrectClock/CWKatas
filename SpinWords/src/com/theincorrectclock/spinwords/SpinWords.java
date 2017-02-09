package com.theincorrectclock.spinwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SpinWords {

    public static int MINIMUM_WORD_LENGTH_TO_SPIN = 5;

    public String spinWords(String sentence) {
        List<String> words = Arrays.asList(sentence.split(" "));
        List<String> newWords = new ArrayList<>();

        for(String word : words) {
            String spinnedWord = spinWord(word);
            newWords.add(spinnedWord);
        }

        return createSentenceFromWords(newWords);
    }

    private String spinWord(String word) {
        if(word.length() < MINIMUM_WORD_LENGTH_TO_SPIN) {
            return word;
        }

        char[] letters = word.toCharArray();
        char[] reverseLetters = new char[word.length()];
        for(int i = 0, j = word.length() - 1; i < word.length(); i++, j--) {
            reverseLetters[i] = letters[j];
        }

        return new String(reverseLetters);
    }

    private String createSentenceFromWords(List<String> words) {
        StringBuilder builder = new StringBuilder();

        Iterator<String> wordsWalker = words.iterator();
        builder.append(wordsWalker.next());
        while(wordsWalker.hasNext()) {
            builder.append(" ");
            builder.append(wordsWalker.next());
        }

        return builder.toString();
    }
}
