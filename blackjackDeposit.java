import java.util.Scanner;

class blackjackDeposit extends BlackJack {
    public static int menuChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("              ");
        System.out.println("[1] DEPOSIT");
        System.out.println("[2] GO BACK");

        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    depositAmount();
                    break;
                case 2:
                    BlackJack.main(new String[0]);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 2.");
            }
        }
    }

    public static void depositAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER DEPOSIT AMOUNT:");
        int depositAmount = scanner.nextInt();

        if (depositAmount > 0 && depositAmount <= blackjackWithdraw.betting_money) {
            blackjackWithdraw.money += depositAmount; 
            blackjackWithdraw.betting_money -= depositAmount;

            System.out.println(" ");
            System.out.println("- - - - - - - - - - - - - - - - - - - ");
            System.out.println("CURRENT CASH IN BANK: $" + blackjackWithdraw.money);
            System.out.println("CURRENT CASH IN BETTING CASH:  $" + blackjackWithdraw.betting_money);
            System.out.println("- - - - - - - - - - - - - - - - - - - ");
            BlackJack.menu();
        } else if (depositAmount > blackjackWithdraw.betting_money){
            System.out.println("ERROR: Cannot Deposit Money you do not have.");
            menuChoice();
        } else {
            System.out.println("ERROR: Please enter a valid deposit amount.");
            depositAmount(); 
        }
    }   
}