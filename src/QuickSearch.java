import java.util.*;

public class QuickSearch {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    static <T> List<Object> getMatches(Collection<T> listNameOne, Collection<T> listNameTwo) {

        Map<Object, String> first;
        List<T> second;
        List<Object> tempList = new ArrayList<>();

        String emptyValue = "";

        if (listNameOne.size() > listNameTwo.size()) {
            second = new ArrayList<>(listNameTwo);
            first = new HashMap<>();
            for (Object one : listNameOne) {
                count++;
                first.put(one, emptyValue);
            }
        } else {
            second = new ArrayList<>(listNameOne);
            first = new HashMap<>();
            for (Object two : listNameTwo) {
                count++;
                first.put(two, emptyValue);
            }
        }

        for (Object key : second) {
            count++;
            if (first.get(key) != null) {
                tempList.add(key);
            }
        }
        return tempList;
    }
}