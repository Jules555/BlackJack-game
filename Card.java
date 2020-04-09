class Card {

    //Creates a playing card.

    private int rank; // represents the rank of a card
    private int suit;//represents the suit of a card
    private int value; // represents the value ofa card

    private static String[] ranks = {"Joker","Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};

    private static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    /*Created with an integer that represents a spot in the String array ranks and the String array suits. This represents
    the rank and suit of an individual card.*/

    Card(int suit, int values) {
        this.rank = values;
        this.suit = suit;
    }

    //Returns the string version of a card.

    public String toString() {
        return ranks[rank] + "of"  + suits[suit];
    }

    //Returns the rank of a card.

    public int getRank() {
        return rank;
    }

    //Returns the suit of a card.

    public int getSuit() {
        return suit;
    }

    // Returns the value of a card. If a jack, queen, or king the value is ten. Aces are 11 for now.

    public int getValue() {
        if (rank==10) {
            value = 10;
        } else if (rank == 1) {
            value = 11;
        } else {
            value = rank;
        }
        return value;
    }

    //Sets the value of a card.

    public void setValue(int set) {
        value = set;
    }
}
