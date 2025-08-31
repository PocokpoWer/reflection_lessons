package task2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

public class AppleForagingTest {
    @Test
    public void shouldMergeApplePieces() {
        List<Participant> applePickers = List.of(
                new Participant("John", 25),
                new Participant("Marcell", 35),
                new Participant("John", 50),
                new Participant("Alice", 32));
        String expected = "John";
        assertEquals(expected, AppleForaging.mergeApplePieces(applePickers));
    }
}
