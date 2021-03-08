import java.util.*;

public class QuickSearch {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    static <T> List<T> getMatches(Collection<T> listNameOne, Collection<T> listNameTwo) {

        Map<T, String> first;
        List<T> second;
        List<T> tempList = new ArrayList<>();

        String emptyValue = "";

        second = new ArrayList<>(listNameTwo);
        first = new HashMap<>();
        for (T one : listNameOne) {
            count++;
            first.put(one, emptyValue);
        }

        for (T key : second) {
            count++;
            if (first.get(key) != null) {
                tempList.add(key);
            }
        }
        return tempList;
    }
}