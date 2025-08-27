import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class HungarianPokerHandEvaluatorTest {
    @Test
    void shouldEvaluatePoker() throws InvalidHandException {
        HandStrengths expecting = HandStrengths.POKER;
        List<Card> cards = Arrays.asList(
                new Card(CardColour.PIROS, CardValue.ASZ),
                new Card(CardColour.PIROS, CardValue.ASZ),
                new Card(CardColour.PIROS, CardValue.ASZ),
                new Card(CardColour.PIROS, CardValue.ASZ),
                new Card(CardColour.PIROS, CardValue.ALSO),
                new Card(CardColour.PIROS, CardValue.KILENCES),
                new Card(CardColour.PIROS, CardValue.KIRALY)
        );
        Hand hand = new Hand(cards);
        assertEquals(expecting, HungarianPokerHandEvaluator.getInstance().evaluate(hand));
    }

    @Test
    void shouldEvaluateFlush() throws InvalidHandException {
        HandStrengths expecting = HandStrengths.FLUSH;
        List<Card> cards = Arrays.asList(
                new Card(CardColour.PIROS, CardValue.ASZ),
                new Card(CardColour.PIROS, CardValue.ASZ),
                new Card(CardColour.PIROS, CardValue.ASZ),
                new Card(CardColour.PIROS, CardValue.KIRALY),
                new Card(CardColour.PIROS, CardValue.FELSO),
                new Card(CardColour.PIROS, CardValue.KILENCES),
                new Card(CardColour.PIROS, CardValue.HETES)
        );
        Hand hand = new Hand(cards);
        assertEquals(expecting, HungarianPokerHandEvaluator.getInstance().evaluate(hand));
    }

    @Test
    void shouldEvaluateAlmostFlush() throws InvalidHandException {
        HandStrengths expecting = HandStrengths.ALMOST_FLUSH;
        List<Card> cards = Arrays.asList(
                new Card(CardColour.PIROS, CardValue.ASZ),
                new Card(CardColour.PIROS, CardValue.ASZ),
                new Card(CardColour.MAKK, CardValue.ASZ),
                new Card(CardColour.PIROS, CardValue.KIRALY),
                new Card(CardColour.PIROS, CardValue.FELSO),
                new Card(CardColour.PIROS, CardValue.KILENCES),
                new Card(CardColour.PIROS, CardValue.HETES)
        );
        Hand hand = new Hand(cards);
        assertEquals(expecting, HungarianPokerHandEvaluator.getInstance().evaluate(hand));
    }
}
