package org.example;

//Stwórz klasę StringUtilities, która będzie zawierała różne metody do operacji na łańcuchach znaków, takie jak:
//        * odwracanie,
//        * usuwanie białych znaków,
//        * sprawdzanie, czy dany łańcuch jest palindromem,
//        * usuwanie spacji i zastosowanie CamelCase,
//        * dwie dodatkowe metody zaproponowane przez Ciebie.
//Napisz testy dla tych metod.



public class StringUtilities {

    public String reverseString(String input) {
        StringBuilder input1 = new StringBuilder(input);
        return  input1.reverse().toString();
    }

    public String removeWhiteCharacters (String input) {
        return input.replaceAll("\\s+", "");
    }

    public boolean isPalindrome(String input) {
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    public String convertToCamelCase (String input) {
        String[] words = input.split("[\\s_-]+");

        return getString(words);
    }


    public boolean containsOnlyDigits(String input) {
        return input.matches("\\d+");
    }

    public String convertKebabToCamel(String input) {
        String[] words = input.split("-");

        return getString(words);
    }

    private String getString(String[] words) {
        StringBuilder camelCaseString = new StringBuilder(words[0].toLowerCase());

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            camelCaseString.append(word.substring(0, 1).toUpperCase());
            camelCaseString.append(word.substring(1).toLowerCase());
        }

        return camelCaseString.toString();
    }

}
