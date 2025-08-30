import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InvalidHandException, IOException {
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
        System.out.println("Result from static data");
        System.out.println(result);

        Properties prop = new Properties();
        String fileSource = "src/application.properties";
        FileInputStream file = new FileInputStream(fileSource);
        prop.load(file);
        List<String> hands = new ArrayList<>(prop.stringPropertyNames());

        System.out.println("Result from the file:");

        for (String c : hands) {
            try {
                String value = prop.getProperty(c);
                String[] split = value.split(",");
                List<Card> cards1 = new ArrayList<>();
                for (String v : split) {
                    cards1.add(new Card(v.trim()));
                }
                Hand hand1 = new Hand(cards1);
                HungarianPokerHandEvaluator hungarianPokerHandEvaluator = HungarianPokerHandEvaluator.getInstance();
                HandStrengths handStrengths = hungarianPokerHandEvaluator.evaluate(hand1);
                System.out.println(handStrengths);
            } catch (InvalidHandException e) {
                System.out.println("Wrong " + c + " " + e.getMessage());
            }
        }
    }
}