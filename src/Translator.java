import java.util.HashMap;

public class Translator {
    HashMap<Integer, String> numericAlpha;

    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < alphabetic.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }
}
