import java.util.Scanner;
import java.util.Random;
public class guessnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String play="yes";
        //while loop to determine if we are going to play the game again
        while (play.equals("yes"))
        {
            Random ran=new Random();
            int rannum=ran.nextInt(100);
            int guess=-1;
            int tries=0;
            //while loop to check if the game is over
            while(guess!=rannum)
            {
                System.out.print("guess a number between 1 and 100");
                guess=sc.nextInt();
                tries++;
                if(guess==rannum){
                    System.out.println("awesome! you guessed the number");
                    System.out.println("it only took you" +tries+ "guesses");
                    System.out.print("would you like to play again?yes or no?");
                    play=sc.next().toLowerCase();
                }
                else if(guess>rannum)
                {
                    System.out.println("your guess is too high, try again");
                }
                else{
                    System.out.println("your guess is too low, try again");
                }
            }
        }
        sc.close();
    }
}
