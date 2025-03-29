package generator;

import java.util.Scanner;

/**
 * Provides the Text User Interface for the user to easily generate the password from the
 * command line.
 */
public class TUI {
    public static void ui() {
        Scanner in = new Scanner(System.in);

        System.out.println("Select one of the options: ");
        System.out.println("1. General Use");
        System.out.println("2. Custom");

        int choice = 0;

        while (choice != 1 && choice != 2) {
            choice = in.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Pls enter a valid option number.");
            }
        }

        if (choice == 1) {
            System.out.print("Generating a password");
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println();
            System.out.println("Generated Password: " + Generator.generate());
        } else {
            boolean hasFinished = false;
            while (!hasFinished) {
                System.out.print("Enter number of uppercase letters: ");
                int upNo = in.nextInt();

                System.out.print("Enter number of lowercase letters: ");
                int loNo = in.nextInt();

                System.out.print("Enter number of digits: ");
                int numNo = in.nextInt();

                System.out.print("Enter number of symbols: ");
                int symNo = in.nextInt();

                try {
                    System.out.print("Generating a password");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println();
                    System.out.println("Generated Password: " + Generator.generate(upNo, loNo, numNo, symNo));
                    hasFinished = true;
                } catch (RuntimeException _) {
                    System.out.println("Invalid argument has passed. Pls enter the valid parameters.");
                }
            }
        }
    }
}
