import java.util.List;

import static java.util.stream.Collectors.*;

public class HungarianPokerHandEvaluator {
    private static final HungarianPokerHandEvaluator instance = new HungarianPokerHandEvaluator();

    private HungarianPokerHandEvaluator() {
    }

    public static HungarianPokerHandEvaluator getInstance() {
        return instance;
    }

    public HandStrengths evaluate(Hand hand) {
        List<Card> cards = hand.getCards();
        if (cards.stream().collect(groupingBy(Card::getCardValue, counting())).values().stream().anyMatch(count -> count == 4)) {
            return HandStrengths.POKER;
        }
        if (cards.stream().collect(groupingBy(Card::getCardColour, counting())).values().stream().anyMatch(count -> count == 7)) {
            return HandStrengths.FLUSH;
        }
        if (cards.stream().collect(groupingBy(Card::getCardColour, counting())).values().stream().anyMatch(count -> count >= 4 && count <= 6)) {
            return HandStrengths.ALMOST_FLUSH;
        }
        return HandStrengths.NOTHING;
    }
}
