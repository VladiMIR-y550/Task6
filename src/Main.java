import java.util.*;

public class Main {
    public static void main(String[] args) {

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

        findMatches(listNameOne, listNameTwo, listNameThree);

        drawCollection(listNameOne);
        drawCollection(listNameTwo);
        drawCollection(listNameThree);
    }

    static void findMatches(Collection<String> listOne,
                            Collection<String> listTwo,
                            Collection<String> listThree) {
        for (String str : listTwo) {
            if (listOne.contains(str)) {
                listThree.add(str);
            }
        }
    }

    static void drawCollection(Collection<String> collection) {
        for (String name : collection) {
            System.out.print(" " + name);
        }
        System.out.println(" ");
    }
}