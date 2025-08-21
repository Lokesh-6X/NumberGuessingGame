import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args)
    {
        System.out.println("=======================================");
        System.out.println(" Welcome to the Number Guessing Game ");
        System.out.println("=======================================\n");

        System.out.println("Game Rules:");
        System.out.println("---------------------------------------");
        System.out.println("Easy   : Guess a number between 1-50");
        System.out.println("Medium : Guess a number between 1-100");
        System.out.println("Hard   : Guess a number between 1-500\n");
        System.out.println("You have 5 attempts to guess the correct number.");
        System.out.println("Feedback will guide you whether your guess is higher or lower.\n");
        
        System.out.print("Choose Difficulty: 1. Easy  2. Medium  3. Hard: ");

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int upperLimit;
        int k = 1;
        int guessedNumber;
        int choice = sc.nextInt();

        while(choice < 1 || choice > 3){
            System.out.print("\nInvalid choice! Please select 1, 2, or 3: ");
            choice = sc.nextInt();
        }

        String level = (choice == 1) ? "Easy" : (choice == 2) ? "Medium" : "Hard";
        System.out.println("\nYou chose " + level + " mode!");

        if (choice == 1) upperLimit = 50;
        else if (choice == 2) upperLimit = 100;
        else upperLimit = 500;

        System.out.println("\nYou need to guess a number between 1 and " + upperLimit + ".");

        int randomNumber = rand.nextInt(upperLimit)+1;
        //System.out.println(randomNumber);

        while(k<=5){
            System.out.print("\nEnter the Number: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue; 
            }
            guessedNumber = sc.nextInt();


            if(guessedNumber>randomNumber){
                System.out.println("\nThe guessed number is higher than the actual number!");
            }else if(guessedNumber<randomNumber){
                System.out.println("\nThe guessed number is lower than the actual number!");
            }else{
                System.out.println("\nCorrect! The guessed number is equal to the actual number!");
                System.out.printf("\nYou took %d attempts\n", k);
                break;
            }
            if(k==5){
                System.out.println("\nGame Over! The actual number is: "+randomNumber);
                break;
            }else{
                System.out.printf("\nAttempt %d finished, %d left\n",k,5-k);
            }
            k++;
        }

        sc.close();




    }
}
