package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileFunReading {
    public static void main(String[] args) {
        new FileFunReading().run();
    }

    private void run() {
        Scanner readFile = null;

        try {
            readFile = new Scanner(new File("text.txt"));
            while (readFile.hasNextLine()){
                String line = readFile.nextLine();
                System.out.println(line);
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




    }
}
