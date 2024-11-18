package org.example.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TextAnalyzerTest {

    TextAnalyzer ta = new TextAnalyzer();

    @Test
    void countWords() {
        assertEquals(0, ta.countWords(""));
        assertEquals(0, ta.countWords(" "));
        assertEquals(0, ta.countWords(null));

        assertEquals(10,
                ta.countWords("Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                        "Maecenas vel. "));
    }

    @Test
    void countSentences() {
        assertEquals(0, ta.countSentences(""));
        assertEquals(0, ta.countSentences(" "));
        assertEquals(0, ta.countSentences(null));

        assertEquals(3, ta.countSentences("Lorem ipsum dolor sit? " +
                "Consectetur adipiscing elit! " +
                "Maecenas vel."));
    }

    @Test
    void calculateAverageWordLength() {
        assertEquals(0, ta.calculateAverageWordLength(""));
        assertEquals(0, ta.calculateAverageWordLength(" "));
        assertEquals(0, ta.calculateAverageWordLength(null));

        assertEquals(3, ta.calculateAverageWordLength("pah pah pah"));
        assertEquals(0, ta.calculateAverageWordLength("."));
        assertEquals(0, ta.calculateAverageWordLength(".!?"));

    }

    @Test
    void countSentencesPro() {
        assertEquals(0, ta.countSentencesPro(""));
        assertEquals(0, ta.countSentencesPro(" "));
        assertEquals(0, ta.countSentencesPro(null));
        assertEquals(3, ta.countSentencesPro("Dr. Smith is here. He arrived at 10 a.m. Isn't that great?"));
        assertEquals(3, ta.countSentencesPro("Lorem ipsum dolor sit? " +
                "Consectetur adipiscing elit! " +
                "Maecenas vel."));
    }
}