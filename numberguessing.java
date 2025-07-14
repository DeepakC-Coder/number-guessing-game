import java.util.Random;
import java.util.Scanner;
class test{
    public static void main(String[] args) {
    System.out.println("Welcome to the Number guessing game");
    System.out.println("Rules: 1. Enter a number from 1 to 20");
    system.out.println("2.If it is right to my guessed number then You are WINNER");
    System.err.println("3.Also I Will Give You Some Hints(Whether it is too high or too low), But you have only 5 CHANCES!!!");
    int chances=5;
    Random randnum=new Random();
    int randomnumber= randnum.nextInt(20)+1;
    Scanner usernum= new Scanner(System.in);
    int guess;
     while (chances > 0) {
            System.out.print("Enter your guess (" + chances + " chances left): ");
            guess = usernum.nextInt();
            if (guess == randomnumber) {
                System.out.println("Congratulations! You guessed the number!");
                break;
            } else if (guess > randomnumber) {
                System.out.println("Too high! Try a smaller number.");
            } else {
                System.out.println("Too low! Try a bigger number.");
            }

            chances--;

            if (chances == 0) {
                System.out.println("YOU LOSE! The correct number was: " + randomnumber);
            }
        }

        usernum.close();
    }
}