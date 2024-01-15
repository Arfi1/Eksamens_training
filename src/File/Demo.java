package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //File processing
        // 1. Open file
        // 2. process the file (read/write)
        // 3. close the file

        // file input (reading from a file)

        Scanner infile = null;

        try {
            infile = new Scanner(new File("words.txt")); // relative path
            while (infile.hasNextLine()) {
                String line = infile.nextLine();
                System.out.println(line);
            }
            infile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // file output (writing to a file)

        try {
            PrintStream outfile = new PrintStream(new File("out.txt"));
            outfile.println("This is my first line in my output file");
            Random rand = new Random();
            for (int i = 0; i < 10; i ++) {
                outfile.println(rand.nextInt(6) + 1);
            }
            outfile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file for writing");
        }
    }
}
