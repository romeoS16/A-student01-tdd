package de.ba.experiment.password;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordStrengthEvaluatorTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).


    // WEAK PASSWORD TESTS
    @Test
    public void nullPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength(null);
        assertEquals("WEAK", result);
    }

    @Test
    public void emptyStringPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("");
        assertEquals("WEAK", result);
    }

    @Test
    public void containsSpace_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("AAab 12112!!");
        assertEquals("WEAK", result);
    }

    @Test
    public void shortPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("abaA1");
        assertEquals("WEAK", result);
    }

    @Test
    public void onlyLowerCase_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("nurlowercasewermachtsowas");
        assertEquals("WEAK", result);
    }

    @Test
    public void onlyUpperCase_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("WIESERIÖSMUSSICHBLEIBEN");
        assertEquals("WEAK", result);
    }

    @Test
    public void onlyNumbers_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("676767676767187");
        assertEquals("WEAK", result);
    }




    // MEDIUM PASSWORD TESTS
    @Test
    public void mediumPasswordUpperLowerCaseNumber() {
        String result = PasswordStrengthEvaluator.evaluateStrength("abaAa1");
        assertEquals("MEDIUM", result);
    }

    @Test
    public void mediumPasswordUpperLowerCaseSpecialChar() {
        String result = PasswordStrengthEvaluator.evaluateStrength("abaAa.");
        assertEquals("MEDIUM", result);
    }

    @Test
    public void mediumPasswordUpperLowerCaseLong() {
        String result = PasswordStrengthEvaluator.evaluateStrength("abaAbabsabaaaaababa");
        assertEquals("MEDIUM", result);
    }

    @Test
    public void mediumPasswordUpperLowerCaseLongExactTen() {
        String result = PasswordStrengthEvaluator.evaluateStrength("abaAbabsab");
        assertEquals("MEDIUM", result);
    }

    @Test
    public void mediumPasswordLowerCaseNumberSpecialChar() {
        String result = PasswordStrengthEvaluator.evaluateStrength("a1a1....");
        assertEquals("MEDIUM", result);
    }

    @Test
    public void mediumPasswordLowerCaseNumberLong() {
        String result = PasswordStrengthEvaluator.evaluateStrength("a1a111111111111111");
        assertEquals("MEDIUM", result);
    }

    // STRONG PASSWORD TESTS
    @Test
    public void strongPasswordNoSpecialChar() {
        String result = PasswordStrengthEvaluator.evaluateStrength("aA1aA111111111111111");
        assertEquals("STRONG", result);
    }

    @Test
    public void strongPasswordNotLong() {
        String result = PasswordStrengthEvaluator.evaluateStrength("aA1aA11!");
        assertEquals("STRONG", result);
    }

    @Test
    public void strongPasswordNoLowerCase() {
        String result = PasswordStrengthEvaluator.evaluateStrength("AAAAAAA111!!!");
        assertEquals("STRONG", result);
    }

    @Test
    public void strongPasswordNoUpperCase() {
        String result = PasswordStrengthEvaluator.evaluateStrength("aaaaaaaaaaaaa111!!!");
        assertEquals("STRONG", result);
    }


}
