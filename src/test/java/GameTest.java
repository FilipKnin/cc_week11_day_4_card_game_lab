import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    Deck deck;
    Player player1;
    Player player2;
    Card card1;
    Card card2;

    @Before
    public void before() {
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
        card1 = new Card(SuitType.CLUBS, RankType.ACE);
        card2 = new Card(SuitType.HEARTS, RankType.THREE);
        game = new Game(deck, player1, player2);
    }

    @Test
    public void hasCheckWin() {

        assertEquals(card1, game.checkWin(card1, card2));
    }
}
