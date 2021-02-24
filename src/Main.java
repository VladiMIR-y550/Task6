import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        UtilSearch match = new UtilSearch();
        Set<String> listNameOne = new HashSet<>();
        listNameOne.add("Simon");
        listNameOne.add("Martin");
        listNameOne.add("Bob");
        listNameOne.add("Adam");
        listNameOne.add("Brian");
        listNameOne.add("Dirk");
        listNameOne.add("Eric");
        listNameOne.add("Jack");
        listNameOne.add("Kyle");
        listNameOne.add("Harry");
        listNameOne.add("Lucas");
        listNameOne.add("Arnold");
        listNameOne.add("Marshall");

        Set<String> listNameTwo = new HashSet<>();
        listNameTwo.add("Kyle");
        listNameTwo.add("Brian");
        listNameTwo.add("Ashley");
        listNameTwo.add("Chad");
        listNameTwo.add("Dirk");
        listNameTwo.add("Eric");
        listNameTwo.add("Jason");
        listNameTwo.add("Elliot");
        listNameTwo.add("Marshall");
        listNameTwo.add("David");

        Set<String> listNameThree = new HashSet<>();

        int iteration = match.searchMatches(listNameOne, listNameTwo, listNameThree);

        System.out.print("Collection first:\t\t" + listNameOne + "\n"
                + "Collection two:\t\t\t" + listNameTwo + "\n"
                + "Collection three:\t\t" + listNameThree + "\n"
                + "Number of iterations:\t" + iteration);
    }
}