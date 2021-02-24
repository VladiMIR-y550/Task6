import java.util.*;

public class UtilSearch {

    public int searchMatches(Collection<String> listNameOne,
                             Collection<String> listNameTwo,
                             Collection<String> listNameThree) {

        Set<String> cloneList = new HashSet<>(listNameTwo);
        int iterations = 0;
        boolean find;

        Iterator<String> enumListOne = listNameOne.iterator();
        while (enumListOne.hasNext()) {
            String firstName = enumListOne.next();
            find = false;
            iterations++;
            Iterator<String> enumListTwo = cloneList.iterator();
            while (enumListTwo.hasNext() && !find) {
                iterations++;
                String secondName = enumListTwo.next();
                if (firstName.equals(secondName)) {
                    iterations++;
                    listNameThree.add(secondName);
                    cloneList.remove(secondName);
                    find = true;
                }
            }
        }
        return iterations;
    }
}