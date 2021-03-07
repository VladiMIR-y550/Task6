import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User simon = new User(78908721, "Simon", 33);
        User martin = new User(74281944, "Martin", 41);
        User bob = new User(89723467, "Bob", 23);
        User adam = new User(18934554, "Adam", 19);
        User brian = new User(56372056, "Brian", 25);
        User dirk = new User(56473932, "Dirk", 60);
        User eric = new User(67596545, "Eric", 43);
        User jack = new User(65840087, "Jack", 30);
        User kyle = new User(95747375, "Kyle", 25);
        User harry = new User(35279933, "Harry", 32);
        User lucas = new User(57493087, "Lucas", 27);
        User arnold = new User(68504971, "Arnold", 33);
        User marshall = new User(67459013, "Marshall", 32);
        User ashley = new User(71245629, "Ashley", 30);
        User chad = new User(46838961, "Chad", 21);
        User jason = new User(82318323, "Jason", 40);
        User elliot = new User(86950443, "Elliot", 36);
        User david = new User(23478776, "David", 32);


        Set<User> listNameOne = new HashSet<>();
        listNameOne.add(simon);
        listNameOne.add(martin);
        listNameOne.add(bob);
        listNameOne.add(adam);
        listNameOne.add(brian);
        listNameOne.add(dirk);
        listNameOne.add(eric);
        listNameOne.add(jack);
        listNameOne.add(kyle);
        listNameOne.add(harry);
        listNameOne.add(lucas);
        listNameOne.add(arnold);
        listNameOne.add(marshall);

        Set<User> listNameTwo = new HashSet<>();
        listNameTwo.add(kyle);
        listNameTwo.add(brian);
        listNameTwo.add(ashley);
        listNameTwo.add(chad);
        listNameTwo.add(dirk);
        listNameTwo.add(eric);
        listNameTwo.add(jason);
        listNameTwo.add(elliot);
        listNameTwo.add(marshall);
        listNameTwo.add(david);

        System.out.print("Collection first:\t\t" + listNameOne + "\n"
                + "Collection two: \t\t" + listNameTwo + "\n"
                + "Collection three:\t\t" + QuickSearch.getMatches(listNameOne, listNameTwo) + "\n"
                + "Number of iterations:\t" + QuickSearch.getCount());
    }
}