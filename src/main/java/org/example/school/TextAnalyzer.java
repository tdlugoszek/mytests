package org.example.school;

//Stwórz klasę, która analizuje tekst i zwraca różne statystyki, takie jak:
//        * liczba słów,
//* liczba zdań,
//* średnia długość słowa,
//        * zaproponuj dwie dodatkowe miary.
//        Napisz testy, aby sprawdzić poprawność analizy tekstu.


public class TextAnalyzer {
    public int countWords(String str) {
        if (str == null || str.isEmpty()) return 0;

        String[] words = str.split("\\s+");
        return words.length;
    }

    public int countSentences(String str) {
        if (str == null || str.isEmpty()) return 0;

        String[] sentences = str.split("[.!?](\\s|$)");

        int count = 0;
        for (String sentence : sentences) {
            if (!sentence.trim().isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public double calculateAverageWordLength(String str) {
        if (str == null || str.isEmpty()) return 0;

        String[] words = str.replaceAll("[.!?]", "").split("\\s+");

        int totalWordLength = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                totalWordLength += word.length();
            }
        }

        return words.length == 0 ? 0 : (double) totalWordLength / words.length;







//        if (str == null || str.isEmpty()) return 0;
//
//        String[] words = str.split("\\s+");
//        int totalLength = 0;
//        for (String word : words) {
//            totalLength += word.length();
//        }
//
//
//        return (double) totalLength / words.length;
    }


    public int countSentencesPro(String str) {
        if (str == null || str.isEmpty()) return 0;
        String abbreviationPattern = "\\b(?:Mr|Mrs|Ms|Dr|Prof|Jr|Sr|St|etc)\\.";

        String placeholder = "___ABBR___";
        String processedText = str.replaceAll(abbreviationPattern, placeholder);

        String[] sentences = processedText.split("(?<!\\w\\.|\\w!)\\s*[.!?](\\s|$)");

        int count = 0;
        for (String sentence : sentences) {
            sentence = sentence.replace(placeholder, ".");
            if (!sentence.trim().isEmpty()) {
                count++;
            }
        }

        return count;
    }
}
