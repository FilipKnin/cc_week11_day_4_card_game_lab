public class Game {
    private Deck deck;
    private Player player1;
    private Player player2;

    public Game(Deck deck, Player player1, Player player2) {
        this.deck = deck;
        this.player1 = player1;
        this.player1 = player2;
    }



    public String checkWin(Card card1, Card card2) {
        String winningCard;

        if (card1.getValueFromEnum() > card2.getValueFromEnum()) {
            winningCard = "Player1 wins!";
        } else if (card1.getValueFromEnum()< card2.getValueFromEnum()){
            winningCard = "Player2 wins!";
        } else {
            winningCard = "Snap!";
        }
        return winningCard;
    }

    public void playTurn() {
        this.deck.populate();
        this.deck.shuffleDeck();
        Card card1 = this.deck.dealCard();
        Card card2 = this.deck.dealCard();
        checkWin(card1, card2);
    }
}
