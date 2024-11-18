package org.example;

import org.example.school.TextAnalyzer;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer textAnalyzer = new TextAnalyzer();

        System.out.println(String.valueOf(textAnalyzer.countSentences(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                        "Nullam consequat erat mauris, in sollicitudin purus commodo eget.")));




        System.out.println(String.valueOf(textAnalyzer.calculateAverageWordLength(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                        "Nullam consequat erat mauris, in sollicitudin purus commodo eget.")));
    }


    }


