import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HungarianPokerHandEvaluator {
    private static final HungarianPokerHandEvaluator instance = new HungarianPokerHandEvaluator();

    private HungarianPokerHandEvaluator() {
    }

    public static HungarianPokerHandEvaluator getInstance() {
        return instance;
    }

    public HandStrengths evaluate(Hand hand) {
        List<Card> cards = hand.getCards();

        Map<CardValue, Integer> cardCount = new HashMap<>();
        for (Card card : cards) {
            CardValue value = card.getCardValue();
            cardCount.put(value, cardCount.getOrDefault(value, 0) + 1);
        }
        for (int count : cardCount.values()) {
            if (count >= 4) {
                return HandStrengths.POKER;
            }
        }

        Map<CardColour, Integer> colorCount = new HashMap<>();
        for (Card card : cards) {
            CardColour cardColour = card.getCardColour();
            colorCount.put(cardColour, colorCount.getOrDefault(cardColour, 0) + 1);
        }
        for (int count : colorCount.values()) {
            if (count == 7) {
                return HandStrengths.FLUSH;
            }
        }

        for (int count : colorCount.values()) {
            if (count >= 4 && count <= 6) {
                return HandStrengths.ALMOST_FLUSH;
            }
        }

        return HandStrengths.NOTHING;
    }
}
