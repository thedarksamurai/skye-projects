import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int computerInput = random.nextInt(100) + 1;
        System.out.println("Let's play the higher lower game");

        Scanner scanner = new Scanner(System.in);
        int userTries = 0;
        boolean done = false;

        while (userTries < 5){
            System.out.println("Choose a number between 1 and 100");
            System.out.println("Please enter in a whole number and press enter to continue.");

            int userInput = scanner.nextInt();

            if (userInput < 1 || userInput > 100){
                System.out.println("Null");
            } else if (userInput > computerInput) {
                System.out.println("Lower");
                userTries++;
            } else if (userInput < computerInput) {
                System.out.println("Higher");
                userTries++;
            } else if (userInput == computerInput) {
                done = true;
                break;
            }
        }
        if (done){
            System.out.println("Victory");
        } else {
            System.out.println("Game Over");
            System.out.println("Sorry you Died. The number was " +  computerInput);
        } scanner.close();
    }
}