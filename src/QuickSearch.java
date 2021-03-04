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
            second = new ArrayList<>(listNameTwo);
            first = new HashMap<>();
            for (String one : listNameOne) {
                count++;
                first.put(one, emptyValue);
            }
        } else {
            second = new ArrayList<>(listNameOne);
            first = new HashMap<>();
            for (String two : listNameTwo) {
                count++;
                first.put(two, emptyValue);
            }
        }

        for (String key : second) {
            count++;
            if (first.get(key) != null) {
                tempList.add(key);
            }
        }
        return tempList;
    }
}