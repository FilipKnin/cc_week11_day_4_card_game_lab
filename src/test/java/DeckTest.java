import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;
    Card card1;
    Card card2;

    @Before
    public void before() {
        deck = new Deck();
        card1 = new Card(SuitType.CLUBS, RankType.ACE);
        card2 = new Card(SuitType.HEARTS, RankType.THREE);
    }

    @Test
    public void hasEmptyDeck() {
        assertEquals(0, deck.checkDeck());
    }
}
