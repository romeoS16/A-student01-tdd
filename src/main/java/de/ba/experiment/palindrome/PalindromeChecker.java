package de.ba.experiment.palindrome;

import java.util.Locale;

public class PalindromeChecker {

    /**
     * Prüft, ob ein gegebener String ein Palindrom ist.
     *
     * Ein Palindrom liest sich vorwärts und rückwärts gleich.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param text der zu prüfende Text (kann null sein)
     * @return true, wenn der Text nach vorgegebener Definition ein Palindrom ist, sonst false
     */

    public static boolean isPalindrome(String text) {

        if(text == null) {
            return false;
        }

        text = text.toLowerCase().replaceAll("\\s+","");


        if (text.length() == 0 || text.length() == 1) {
            return true;
        }

        else if (text.charAt(text.length()-1) == text.charAt(0)) {
            return isPalindrome(text.substring(1, text.length()-1));
        }

        return false;

    }
}
