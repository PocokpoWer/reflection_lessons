import java.util.List;

public class Hand {
    final List<Card> cards;

    public Hand(List<Card> cards) throws InvalidHandException {
        if (cards.size() != 7) {
            throw new InvalidHandException("You need seven card!");
        }
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }
}
