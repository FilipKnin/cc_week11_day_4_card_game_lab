public class Game {
    private Deck deck;
    private Player player1;
    private Player player2;

    public Game(Deck deck, Player player1, Player player2) {
        this.deck = deck;
        this.player1 = player1;
        this.player1 = player2;
    }

    public Card checkWin(Card card1, Card card2) {
        Card winningCard;

        if (card1.getValueFromEnum() > card2.getValueFromEnum()) {
            winningCard = card1;
        } else {
            winningCard = card2;
        }
        return winningCard;
    }
}
