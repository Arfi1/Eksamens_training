package Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class RandomizeArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // udskrive Arrayliste før randomisering

        System.out.println("ArrayList før randomisering: " + numbers);

        // Randomiser (omarranger) elementerne i ArrayList
        Collections.shuffle(numbers);

        // udskriv ArrayList efter randomisering
        System.out.println("ArratList efter randomisering: " + numbers);
    }
}
