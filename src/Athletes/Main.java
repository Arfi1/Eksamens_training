package Athletes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    ArrayList<Athlete> athletes = new ArrayList<>();
    public void saveNow(){
        File file = new File("Athletes.txt");

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(file, true));
            for (Athlete athlete: athletes) {
                ps.println(athlete.getName() + " | " + athlete.isActive()+ " | "  + athlete.getPoints());
            }
            ps.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    private void run() {
        athletes.add(new Athlete("John doe", true, 400));
        athletes.add(new Athlete("Martin Kingjr", false, 10001));


        for (Athlete athlete : athletes) {
            System.out.println(athlete.getName() + " | " + athlete.isActive()+ " | "  + athlete.getPoints());
        }
        saveNow();

    }
}
