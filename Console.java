public class Console {
    static final String START_GAME = "Запуск игры. На столе 20 спичек";

    public Console() {
        System.out.println(START_GAME);
    }

    public void printRemainingMatches(int numberOfMatches) {
        System.out.println("На столе осталось " + numberOfMatches + " спичек.");
    }

    public void printMove(boolean isComputer, int choosenMatches) {
        if (isComputer) {
            System.out.println("- Количество выбранных компьютером спичек: " + choosenMatches);
        } else {
            System.out.print("Ход игрока. Введите количество спичек: ");
        }
    }

    public void printFromTo() {
        System.out.println("Спичек должно быть от 1 до 3");
    }

    public void printYouLose() {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }
}