import java.util.*;

public class QuickSearch {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    static Collection<String> getMatches(Set<String> listNameOne, Set<String> listNameTwo) {

        Map<String, String> first;
        List<String> second;
        List<String> tempList = new ArrayList<>();

        String emptyValue = "";

        if (listNameOne.size() > listNameTwo.size()) {
            first = new HashMap<>();
            for (String one : listNameOne) {
                first.put(one, emptyValue);
            }
            second = new ArrayList<>(listNameTwo);
        } else {
            first = new HashMap<>();
            for (String two : listNameTwo) {
                first.put(two, emptyValue);
            }
            second = new ArrayList<>(listNameOne);
        }

        for (String key : second) {
            count++;
            if (findMatches(first, key)) {
                tempList.add(key);
            }
        }
        return tempList;
    }

    static boolean findMatches(Map<String, String> first, String key) {
        count++;
        return first.get(key) != null;
    }
}