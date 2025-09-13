package task2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppleForaging {
    public static String mergeApplePieces(List<Participant> list) {
        Map<String, Integer> mergeApples = new HashMap<>();
        for (Participant entry : list) {
            mergeApples.merge(entry.getName(), entry.getApples(), Integer::sum);
        }
        mergeApples.entrySet().stream().sorted(Map.Entry.comparingByValue());
        return Collections.max(mergeApples.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
