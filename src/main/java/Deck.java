import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public int checkDeck() {
        return this.deck.size();
    }
}
