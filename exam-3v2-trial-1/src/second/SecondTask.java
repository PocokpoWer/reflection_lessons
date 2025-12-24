package second;

import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        int capacity = list1.size() + list2.size();
        List<Integer> mergeList = new ArrayList<>(capacity);
        int i = 0;
        while (i < list1.size() || i < list2.size()) {
            if (i < list1.size()) {
                mergeList.add(list1.get(i));
            }
            if (i < list2.size()) {
                mergeList.add(list2.get(i));
            }
            i++;
        }
        return mergeList;
    }
}
