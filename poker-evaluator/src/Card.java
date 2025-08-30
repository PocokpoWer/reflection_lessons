public class Card {
    private CardColour cardColour;
    private CardValue cardValue;

    public Card(CardColour cardColour, CardValue cardValue) {
        this.cardColour = cardColour;
        this.cardValue = cardValue;
    }

    public Card(String code) throws InvalidHandException {
        this.cardColour = CardColour.fromCode(code.charAt(0));
        this.cardValue = CardValue.fromCode(code.substring(1));
    }

    @Override
    public String toString() {
        return String.format("%s - %s", cardColour, cardValue);
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public CardColour getCardColour() {
        return cardColour;
    }
}
