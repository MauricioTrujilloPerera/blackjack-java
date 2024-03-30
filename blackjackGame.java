import java.util.Random;
import java.util.Scanner;

class blackjackGame extends BlackJack {

    public static class Game {
        public static String[] numberedCards() {
           String[] numbered_cards = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; // *NOTE* ADD ACE LATER
           return numbered_cards;
        }

        public static String[] suitCards() {
           String[] suited_cards = {"Hearts", "Spades", "Clovers", "Clubs"};
           return suited_cards;
        }

        public static void playGame() {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            String[] numbered_cards = Game.numberedCards(); // calls the method for faced cards
            String[] suited_cards = Game.suitCards(); // calls the method for numbered cards

            int cardsNumIndex = random.nextInt(numbered_cards.length);
            int cardsSuitIndex = random.nextInt(suited_cards.length);
            int cardsNumIndex2 = random.nextInt(numbered_cards.length); // Second random variable is needed to keep both print statements different from one another
            int cardsSuitIndex2 = random.nextInt(suited_cards.length);
    
            // Game initiates here. . .
            System.out.println("How would would you like to Bet this Round? ");
            int bet_amount = scanner.nextInt();

            while (true) {
                if (bet_amount > 0 && bet_amount <= blackjackWithdraw.betting_money) {
                    int chipsBetted = (blackjackWithdraw.betting_money - bet_amount);

                    BlackJack.table2();
                    System.out.println(" ");
                    System.out.println("Your First Card is a " + numbered_cards[cardsNumIndex] + " of " + suited_cards[cardsSuitIndex]);
                    System.out.print("and Your Second Card is a " + numbered_cards[cardsNumIndex2] + " of " + suited_cards[cardsSuitIndex2]);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                } else if (bet_amount > blackjackWithdraw.betting_money) {
                System.out.println("You Cannot Bet more than you have currently Withdrawned, Please Make a Withdrawal. . .");
                BlackJack.menu();
                break;
                } else if (bet_amount <= 0) {
                    System.out.println("Please Enter a Value more than 0, or Withdraw more Money. . .");
                    BlackJack.menu();
                } else {
                    continue;
                }
            }

        }
    }
}