package org.example.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilitiesTest {

    private StringUtilities stringUtilities  = new StringUtilities();

    @Test
    void reverseString() {
        String string = stringUtilities.reverseString("World");
        String string2 = stringUtilities.reverseString("Hello World");
        assertEquals("dlroW", string);
        assertEquals("dlroW olleH", string2);
    }

    @Test
    void removeWhiteCharacters() {
        String string = stringUtilities.removeWhiteCharacters("He ll o W or ld ");
        String string2 = stringUtilities.removeWhiteCharacters("\nHe \tll o W \nor l\\u2705d    \\u2009     \n");
        assertEquals("HelloWorld", string);
    }

    @Test
    void isPalindrome() {
        assertTrue(stringUtilities.isPalindrome("civic"));
        assertTrue(stringUtilities.isPalindrome("TacO Cat"));
    }

    @Test
    void convertToCamelCase() {
        assertEquals("helloWorld", stringUtilities.convertToCamelCase("hello world"));
        assertEquals("helloWorld", stringUtilities.convertToCamelCase("HELLO wOrLd"));
    }

    @Test
    void containsOnlyDigits() {
        assertFalse(stringUtilities.containsOnlyDigits("123False"));
        assertTrue(stringUtilities.containsOnlyDigits("1234567890"));
    }

    @Test
    void convertKebabToCamel() {
        assertEquals("helloWorld", stringUtilities.convertKebabToCamel("hello-world"));
        assertEquals("helloWorld", stringUtilities.convertKebabToCamel("HeLLo-WORLD"));
    }
}