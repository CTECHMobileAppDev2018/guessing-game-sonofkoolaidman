import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {
    
      System.out.println("Welcome to the guessing game.");
      
      Random rand = new Random();
      int rnumber = rand.nextInt(101);
      int guesscount = 0;
      Scanner myObj = new Scanner(System.in);
      int input = myObj.nextInt();
      while (input != rnumber) {
        guesscount = guesscount++;
        if (input < rnumber) {
          System.out.println("too low");
          input = myObj.nextInt();
        } else if (input > rnumber) {
          System.out.println("too high"); 
          input = myObj.nextInt();
        }
      }
      System.out.println("You guessed correctly! it took you " + guesscount + " tries");
      
    }
    
}
