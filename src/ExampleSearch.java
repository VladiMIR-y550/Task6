import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExampleSearch {

    private static int count;

    static List<String> getMatches(Collection<String> listOne, Collection<String> listTwo) {

        List<String> first;
        List<String> second;
        List<String> tempList = new ArrayList<>();

        if (listOne.size() < listTwo.size()) {
            first = new ArrayList<>(listOne);
            second = new ArrayList<>(listTwo);
        } else {
            first = new ArrayList<>(listTwo);
            second = new ArrayList<>(listOne);
        }

        for (String str : first) {
            count++;
            if (delIfContains(second, str)) {
                tempList.add(str);
            }
        }

        return tempList;
    }

    static int getCount() {
        return count;
    }

    private static boolean delIfContains(List<String> list, String str) {
        if (str != null || list.size() == 0) {
            for (int i = 0; i < list.size(); i++) {
                count++;
                if (list.get(i).equals(str)) {
                    list.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
}
