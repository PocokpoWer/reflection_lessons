import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidHandException {
        List<Card> cards = Arrays.asList(
                new Card(CardColour.PIROS, CardValue.ASZ),
                new Card(CardColour.PIROS, CardValue.KIRALY),
                new Card(CardColour.PIROS, CardValue.FELSO),
                new Card(CardColour.PIROS, CardValue.ALSO),
                new Card(CardColour.PIROS, CardValue.TIZES),
                new Card(CardColour.PIROS, CardValue.KILENCES),
                new Card(CardColour.PIROS, CardValue.NYOLCAS)
        );
        Hand hand = new Hand(cards);
        HungarianPokerHandEvaluator evaluator = HungarianPokerHandEvaluator.getInstance();
        HandStrengths result = evaluator.evaluate(hand);
        System.out.println(result);
    }
}