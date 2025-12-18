package de.ba.experiment.password;

import java.util.regex.Pattern;

public class PasswordStrengthEvaluator {

    /**
     * Bewertet die Stärke eines Passworts.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param password das zu prüfende Passwort
     * @return "WEAK", "MEDIUM" oder "STRONG" nach Definition
     */


    private static final Pattern[] inputRegexes = new Pattern[5];

    static {
        inputRegexes[0] = Pattern.compile(".*[A-Z].*");                                                     // Upper Case
        inputRegexes[1] = Pattern.compile(".*[a-z].*");                                                     // Lower Case
        inputRegexes[2] = Pattern.compile(".*[0-9].*");                                                     // Ziffer
        inputRegexes[3] = Pattern.compile(".*[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?].*");              // Sonderzeichen
        inputRegexes[4] = Pattern.compile("[a-zA-Z0-9`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?]{10,}");    // Länge >= 10
    }

    public static String evaluateStrength(String password) {
        if (password == null || password.length() < 6 || password.contains(" ")) return "WEAK";

        int points = 0;

        for (Pattern inputRegex : inputRegexes) {
            if (inputRegex.matcher(password).matches()) points += 1;
        }

        if (points <= 2) return "WEAK";
        else if (points == 3) return "MEDIUM";
        else return "STRONG";
    }
}
