import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public int checkDeck() {
        return this.deck.size();
    }

    public void populate() {
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                this.deck.add(new Card(suits[i], ranks[j]));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

}
