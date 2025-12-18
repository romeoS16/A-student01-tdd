package de.ba.experiment.palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void simpleLowercasePalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("anna");
        assertTrue(result);
    }

    // TODO: weitere Testfälle ergänzen

    @Test
    public void simpleLowercasePalindrome_returnsFalse() {
        boolean result = PalindromeChecker.isPalindrome("annaa");
        assertFalse(result);
    }

    @Test
    public void unevenPalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("abcba");
        assertTrue(result);
    }

    @Test
    public void unevenPalindrome_returnsFalse() {
        boolean result = PalindromeChecker.isPalindrome("abcaa");
        assertFalse(result);
    }

    @Test
    public void caseInsensitive_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("aNna");
        assertTrue(result);
    }

    @Test
    public void emptyString_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("");
        assertTrue(result);
    }

    @Test
    public void null_returnsFalse() {
        boolean result = PalindromeChecker.isPalindrome(null);
        assertFalse(result);
    }

    @Test
    public void longPalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba");
        assertTrue(result);
    }

    @Test
    public void ignoreSpaces_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("a a   a aaa");
        assertTrue(result);
    }

    @Test
    public void numbers_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("123321");
        assertTrue(result);
    }

    @Test
    public void specialChars_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("!§((§!");
        assertTrue(result);
    }
}
