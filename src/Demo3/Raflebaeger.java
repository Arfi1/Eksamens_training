package Demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raflebaeger {
    private int numberOfDie;
    private List<Integer> dieEyes;

    public Raflebaeger(int numberOfDie){
        this.numberOfDie = numberOfDie;
        this.dieEyes = new ArrayList<>();

        for (int i = 0; i < numberOfDie; i ++) {
            dieEyes.add(1);
        }
    }


    public int shake() {
        Random random = new Random();
        int sumOfDieEyes = 0;


        for (int i = 0; i < numberOfDie; i++) {
            int dieEyes = random.nextInt(6) + 1;
            sumOfDieEyes += dieEyes;
            this.dieEyes.set(i, dieEyes);
        }
        return sumOfDieEyes;
    }

    public List<Integer> se() {
        return new ArrayList<>(dieEyes);
    }


    public static void main(String[] args) {
        Raflebaeger raflebaeger = new Raflebaeger(3);

        int sumOfDieEyes = raflebaeger.shake();
        System.out.println("Samlet antal øjne efter ryst: " + sumOfDieEyes);

        List<Integer> dieEyes = raflebaeger.se();
        System.out.println("Terningernes øjne: " + dieEyes);
    }
}
