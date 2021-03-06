import java.util.Arrays;

public class Card5 {

    private final String[] VALID_RANKS =
        {"2", "3", "4", "5", "6", "7", "8", "9",
         "10", "jack", "queen", "king", "ace"};
    private final String[] VALID_SUITS =
        {"diamonds", "clubs", "hearts","spades"};

    private String rank;
    private String suit;

    public String toString() {
        return rank + " of " + suit;
    }

    public void setRank(String rank) {
        if (!isValidRank(rank)) {
            System.out.println(rank + " is not a valid rank.");
            System.exit(0);
        }
        this.rank = rank;
    }

    public void setSuit(String suit) {
        if (!isValidSuit(suit)) {
            System.out.println(suit + " is not a valid suit.");
            System.exit(0);
        }
        this.suit = suit;
    }

    private boolean isValidRank(String someRank) {
        return Arrays.asList(VALID_RANKS).contains(someRank);
    }

    private boolean isValidSuit(String someSuit) {
        return Arrays.asList(VALID_SUITS).contains(someSuit);
    }
}
