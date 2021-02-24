import java.util.*;

public class Util {

    public int searchMatches(Collection<String> listNameOne,
                             Collection<String> listNameTwo,
                             Collection<String> listNameThree) {
        int iterations = 0;
        Set<String> cloneList = new HashSet<>(listNameTwo);
        Iterator<String> enumListOne = listNameOne.iterator();

        boolean find;

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