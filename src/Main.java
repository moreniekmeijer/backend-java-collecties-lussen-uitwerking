
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeric = new ArrayList<>();
        List<String> alphabetic = new ArrayList<>();

        numeric.add(1);
        numeric.add(2);
        numeric.add(3);
        numeric.add(4);
        numeric.add(5);
        numeric.add(6);
        numeric.add(7);
        numeric.add(8);
        numeric.add(9);
        numeric.add(0);

        alphabetic.add("one");
        alphabetic.add("two");
        alphabetic.add("three");
        alphabetic.add("four");
        alphabetic.add("five");
        alphabetic.add("six");
        alphabetic.add("seven");
        alphabetic.add("eight");
        alphabetic.add("nine");
        alphabetic.add("zero");

        // verkeerde argumenten, liep hierop vast
        new Translator(alphabetic, numeric);




    }
}
