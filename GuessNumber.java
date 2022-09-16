import java.util.Random;
import java.util.Scanner;


public class GuessNumber {
    public static void main(String[] args) {
        int playerNum,computerNum;

        Random rd = new Random();
        computerNum = rd.nextInt(50);

        Scanner sc = new Scanner(System.in);

        boolean rightWrong = true;
        boolean playAgain = true;

        String yesNo;

        int attempt = 5; //variable to limit the guess attempt

        do {
            while(rightWrong != false && attempt != 0)
            {
                System.out.println("\n=========[ GUESS NUMBER ]=========");
                System.out.println("\nEnter your guess between [1 - 50] : ");
                playerNum = sc.nextInt();

                if(playerNum == computerNum)
                {
                    System.out.println("\nYou guessed correct : " + playerNum);
                    rightWrong = false;
                    break;
                    
                }else if(playerNum > computerNum)
                {
                    System.out.println("\nYou guessed high");
                    attempt--; // decreamenting attempt if guess is wrong
                    System.out.println("Attempt left : " + attempt);
                
                }else if(playerNum < computerNum)
                {
                    System.out.println("\nYou guessed low");
                    attempt--; // decreamenting attempt if guess is wrong
                    System.out.println("Attempt left : " + attempt);
                }
            }

            // Checking attempt if guess is correct and attempt is greater than 0
            if(attempt > 0 && rightWrong == false)
            {
                System.out.println("\nYou have " + attempt + " attempts left :)");
            }
            // Checking attempt if no attempt is left
            else if(attempt == 0 && rightWrong == true)
            {
                System.out.println("\nYour have " + attempt + " attempt left :(");
            }

            System.out.println("\nDo you want to play again? [Y/N]");
            yesNo = sc.next();
            yesNo = yesNo.toUpperCase();

            char ch = yesNo.charAt(0);

            if(ch == 'Y')
            {
                playAgain = true;
                attempt = 5; //Re-initializing attempt variable if player wants to play again
            }else if(ch == 'N')
            {
                playAgain = false;
            }

        } while (playAgain);
        System.out.println("=========[ GAME END ]=========");
    }
}
