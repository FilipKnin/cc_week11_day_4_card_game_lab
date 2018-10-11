import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void cangetRank() {
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void cardHasValue() {
        assertEquals(11, card.getValueFromEnum());
    }

}