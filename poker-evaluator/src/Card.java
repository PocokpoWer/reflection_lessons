public class Card {
    private CardColour cardColour;
    private CardValue cardValue;

    public Card(CardColour cardColour, CardValue cardValue) {
        this.cardColour = cardColour;
        this.cardValue = cardValue;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public CardColour getCardColour() {
        return cardColour;
    }
}
