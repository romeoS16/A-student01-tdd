package de.ba.experiment.fizzbuzz;

public class FizzBuzz {

    /**
     * Gibt für die Zahlen von 1 bis n jeweils einen String zurück.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param n die größe des Arrays
     * @return ein String-Array der Länge n mit den FizzBuzz-Werten
     */

    public static String[] fizzBuzz(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException();
        }

        String[] arr = new String[n];

        for (int i = 1; i <= arr.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[i-1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i-1] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i-1] = "Buzz";
            } else {
                arr[i-1] = Integer.toString(i);
            }
        }
        return arr;
    }
}
