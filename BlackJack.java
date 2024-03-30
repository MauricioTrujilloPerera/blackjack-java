import java.util.Scanner;

public class BlackJack {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);        
        int choice;

        blackjackTitle();

        while (true) {
        System.out.println("                                            [1] START NEW GAME:                                              ");
        System.out.println("                                            [2] MAKE A DEPOSIT:                                              ");
        System.out.println("                                            [3] MAKE A WITHDRAW:                                             ");
        System.out.println("                                            [4] EXIT:                                                        ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    clearScreenFunction();
                    blackjackGame.Game.playGame();
                    return;
                case 2:
                    clearScreenFunction();
                    blackjackDeposit.menuChoice();
                    return;
                case 3:
                    clearScreenFunction();
                    blackjackWithdraw.menuChoice();
                    return;
                case 4:
                    clearScreenFunction();
                    table1();
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }

    //- - - - - - - - - - - - - - - - Ignore everything below this line, as it is just space for spacious text - - - - - - - - - - - - - - - -

    public static void clearScreenFunction() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void blackjackTitle() {
        System.out.println("            _________.____       _____  _________  ____  __.    ____.  _____  _________  ____  __.          ");
        System.out.println("            \\______   \\    |     /  _  \\ \\_   ___ \\|    |/ _|   |    | /  _  \\ \\_   ___ \\|    |/ _| ");
        System.out.println("            |    |  _/    |    /  /_\\  \\/    \\  \\/|      <     |    |/  /_\\  \\/    \\  \\/|      <    ");
        System.out.println("            |    |   \\    |___/    |    \\     \\___|    |  \\/\\__|    /    |    \\     \\___|    |  \\   ");
        System.out.println("            |______  /_______ \\____|__  /\\______  /____|__ \\________\\____|__  /\\______  /____|__ \\    ");
        System.out.println("                    \\/        \\/        \\/        \\/                \\/        \\/        \\/        \\/");
        System.out.println(" ");
    }

    public static void table1() {
        System.out.println("   _________________________     ");
        System.out.println("  //                       \\    ");
        System.out.println(" //                         \\   ");
        System.out.println("//                           \\  ");
        System.out.println("||                            || ");
        System.out.println("||       (Your 2 Cards)       || ");
        System.out.println("||                            || ");
        System.out.println("||                            || ");
        System.out.println("||                            || ");
        System.out.println("||         _______            || ");
        System.out.println("||        |       |           || ");
        System.out.println("||        |   ♠   |           || ");
        System.out.println("||        |       |           || ");
        System.out.println("||        |_______|           || ");
        System.out.println("||                            || ");
    }

    public static void table2() {
        System.out.println("   _________________________     ");
        System.out.println("  //                       \\    ");
        System.out.println(" //                         \\   ");
        System.out.println("//                           \\  ");
        System.out.println("||                            || ");
        System.out.println("||       (Your 2 Cards)       || ");
        System.out.println("||                            || ");
        System.out.println("||                            || ");
        System.out.println("||                            || ");
        System.out.println("||     _______   _______      || ");
        System.out.println("||    |       | |       |     || ");
        System.out.println("||    |   ♠   | |   ♠   |     || ");
        System.out.println("||    |       | |       |     || ");
        System.out.println("||    |_______| |_______|     || ");
        System.out.println("||                            || ");
    }

    public static void dealerTable() {
        System.out.println("   _________________________     ");
        System.out.println("  //                       \\    ");
        System.out.println(" //                         \\   ");
        System.out.println("//                           \\  ");
        System.out.println("||                            || ");
        System.out.println("||       (Dealers 2 Cards)       || ");
        System.out.println("||                            || ");
        System.out.println("||                            || ");
        System.out.println("||                            || ");
        System.out.println("||     _______   _______      || ");
        System.out.println("||    |       | |       |     || ");
        System.out.println("||    |   ♠   | |   ♠   |     || ");
        System.out.println("||    |       | |       |     || ");
        System.out.println("||    |_______| |_______|     || ");
        System.out.println("||                            || ");
    }
}