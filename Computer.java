public class Computer {
    int computerNumberOfMatches;

    public int computerMove(int playerMatches) {
        if (playerMatches == 0) {
            return 3;
        } else {
            return 4 - playerMatches;
        }
    }
}