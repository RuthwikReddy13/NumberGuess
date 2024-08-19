import java.util.Scanner;
import java.util.Random;

class NumberGuess {
    public static void main(String args[]) {

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        char will = 'y';

        while (will == 'y') {
            int tries = 0, chances, guess = -1;
            chances = 4;
            int rno = rnd.nextInt(10) + 1;
            while (guess != rno && chances > 0) {
                System.out.println("Guess the number between 1 and 10(inclusive) (You have " + chances + " chances left):");
                guess = sc.nextInt();
                tries++;
                chances--;

                if (guess > rno) {
                    System.out.println("Oops! Guessed number is too high... Try again. " + chances + " chances left.");
                } else if (guess < rno) {
                    System.out.println("Guessed number is too low... Try again. " + chances + " chances left.");
                } else {
                    System.out.println("Correct Guess! You won with " + tries + " tries.");
                }
            }

            if (guess != rno) {
                System.out.println("Out of chances... You lost! The correct number was " + rno + ".");
            }

            System.out.println("Would you like to continue? (y/n):");
            String s = sc.next();
            will = s.charAt(0);  
        }

        sc.close();
    }
}
