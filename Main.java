public class Main {
    public static void main(String[] args) {
        int numberOfMatches = 20;
        int compNumberMatches = 0;
        int playerNumberMatches = 0;
        boolean isComputer = true;
        Console console = new Console();
        Computer computer = new Computer();
        Player player = new Player();

        while (numberOfMatches > 1) {
            compNumberMatches = computer.computerMove(playerNumberMatches);
            numberOfMatches -= compNumberMatches;
            console.printMove(isComputer, compNumberMatches);
            isComputer = false;
            if (numberOfMatches > 1) {
                console.printRemainingMatches(numberOfMatches);
                playerNumberMatches = player.playerMove(console, isComputer);
                numberOfMatches -= playerNumberMatches;
                console.printRemainingMatches(numberOfMatches);
                isComputer = true;
            } else {
                console.printYouLose();
            }
        }
    }
}