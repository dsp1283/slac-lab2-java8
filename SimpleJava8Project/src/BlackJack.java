import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BlackJack {
    public static void main(String args[]) {

        int playerScore;
        int computerScore;

        playerScore = calculateScore("You");
        computerScore = calculateScore("Computer");
    }

    private static int calculateScore(String user){
        Random random = new Random();
        int card1 = random.nextInt(10) + 1;
        int card2 = random.nextInt(10) + 1;

        System.out.println(user +" got a : " + card1 +" "+ card2);

        return  card1 + card2;
    }

}
