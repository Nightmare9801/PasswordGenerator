package generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * The class Generator for the password generation
 */
public class Generator {
    public static final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lowercase = "abcdefghijklmnopqrstuvwxyz";
    public static final String numbers = "0123456789";
    public static final String symbols = "~!@#$%^&*()_+-=/*.:;<>|\\{}[]'\"?";

    /**
     * Generates a password using the given parameters
     *
     * @param upNo Parameter defining the number of uppercase characters required in the password.
     * @param loNo Parameter defining the number of lowercase characters required in the password.
     * @param numNo Parameter defining the number of numerical characters required in the password.
     * @param symNo Parameter defining the number of symbols required in the password.
     * @return The generated password using the given password
     * @throws IllegalArgumentException Thrown when any of the parameters are negative
     */
    public static String generate(int upNo, int loNo, int numNo, int symNo) throws IllegalArgumentException {
        if (upNo < 0 || loNo < 0 || numNo < 0 || symNo < 0) {
            throw new IllegalArgumentException("Character counts cannot be negative.");
        }

        StringBuilder s = new StringBuilder();

        Random rand = new Random();

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < upNo; i++) chars.add(uppercase.charAt(rand.nextInt(uppercase.length())));
        for (int i = 0; i < loNo; i++) chars.add(lowercase.charAt(rand.nextInt(lowercase.length())));
        for (int i = 0; i < numNo; i++) chars.add(numbers.charAt(rand.nextInt(numbers.length())));
        for (int i = 0; i < symNo; i++) chars.add(symbols.charAt(rand.nextInt(symbols.length())));

        Collections.shuffle(chars, rand);

        for (Character c : chars) {
            s.append(c);
        }

        return s.toString();
    }

    /**
     * Generates a medium level password using predefined parameters.
     *
     * @return The generated password based on the predefined parameters
     * @throws IllegalArgumentException Thrown in case any of the predefined parameters are negative in value.
     */
    public static String generate() throws IllegalArgumentException {
        return generate(3, 5, 2, 2);
    }
}
