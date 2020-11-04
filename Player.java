import java.util.Scanner;

public class Player {
    int playerNumberOfMatches = 0;

    public static boolean isNotCorrect(int playerNumberOfMatches) {
        while ((playerNumberOfMatches < 1 || playerNumberOfMatches > 3)) {
            return true;
        }
        return false;
    }

    public int playerMove(Console console, boolean isComputer) {
        do {
            console.printMove(isComputer, 0);
            playerNumberOfMatches = new Scanner(System.in).nextInt();
            if (isNotCorrect(playerNumberOfMatches)) {
                console.printFromTo();
            }
        }
        while (isNotCorrect(playerNumberOfMatches));
        return playerNumberOfMatches;
    }
}