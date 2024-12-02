import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        HashSet<Integer> secretNumber = randomnumbergenerator();
        String stringNumber = setToStringConverter(secretNumber);
        // System.out.println(stringNumber);
        feedback(stringNumber);
    }

    public static HashSet<Integer> randomnumbergenerator() {
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        while (set.size() < 4) {
            set.add(random.nextInt(10));
        }
        return set;
    }

    public static String setToStringConverter(HashSet<Integer> secretNumber) {
        String string = "";
        for (int i = 0; i < secretNumber.size(); i++) {
            string += secretNumber.toArray()[i];
        }
        return string;
    }

    public static void feedback(String stringNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij Mastermind!");
        System.out.println("Doe een gok. Let op: vul 4 getallen in.");
        System.out.println("Uitleg van de feedback: \n+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        String guess = scanner.nextLine();
        while (!Objects.equals(guess, stringNumber)) {
            StringBuilder feedback = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringNumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringNumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
            System.out.println(feedback.toString());
            System.out.println("Try again...");
            guess = scanner.nextLine();
        }
        System.out.println("Je hebt het correct!");
    }
}

// Antwoord stap 4: Omdat we een vast aantal cijfers nodig hadden, dat gaat ook met een Array.
// Tevens hadden we dan de tweede methode denk ik niet nodig?...