package internship;

import java.util.Scanner;

public class GuessNumber {
 
    // Function that implements the
    // number guessing game
    public static void
    guessNum()
    {
       
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100
                               * Math.random());
        int K = 3;
        int m, guess;
 
        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number"
            + " within 3 trials.");
        for (m = 0; m < K; m++) {
 
            System.out.println(
                "Guess the number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
            }
            else if (number > guess
                     && m != K - 1) {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if (number < guess
                     && m != K - 1) {
                System.out.println(
                    "The number is"
                    + " less than " + guess);
            }
        }
 
        if (m == K) {
            System.out.println(
                "You have exhausted"
                + " K trials.");
 
            System.out.println(
                "The number was " + number);
        }
    }
 
    // Driver Code
    public static void main(String arg[])
    {
 
        
        guessNum();
    }
}