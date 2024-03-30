import java.util.Scanner;

class blackjackWithdraw extends BlackJack {
    public static int money = 1000;
    public static int betting_money;

    public static int menuChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("              ");
        System.out.println("[1] WITHDRAW");
        System.out.println("[2] GO BACK");

        int choice;
        while (true) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    withdrawAmount();
                    return betting_money; 
                case 2:
                    BlackJack.main(new String[0]);
                    return betting_money; 
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 2.");
            }
        }
    }

    public static void withdrawAmount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER WITHDRAW AMOUNT:");
        int withdrawAmount = scanner.nextInt();

        if (withdrawAmount > money) {
            System.out.println("Cannot Withdraw an Exceeding Amount in your Bank; please try again...");
            withdrawAmount();
        } else if (withdrawAmount <= 0) {
            System.out.println("ERROR: ENTER A VALID AMOUNT OF MONEY:");
            menuChoice();
        } else {
            money -= withdrawAmount;
            betting_money += withdrawAmount; 
            System.out.println(" ");
            System.out.println("- - - - - - - - - - - - - - - - - - - ");
            System.out.println("|  New Current Amount of Money: " + money + "  |");
            System.out.println("| Withdrawn Cash for Bets: " + betting_money + "     |");
            System.out.println("- - - - - - - - - - - - - - - - - - - ");
            BlackJack.menu();
        }
    }
}
