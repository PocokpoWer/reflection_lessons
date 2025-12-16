package first;

import java.util.List;

public class FirstTask {
    public static List<Integer> getListWithThreshold(List<Integer> list, int threshold) {
        return list.stream().filter(number -> number >= threshold).toList();
    }
}
