package File;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileFunWriting {
    public static void main(String[] args) {
        new FileFunWriting().run();
    }


    private void run() {

        File file1 = new File("Mine.txt");

        try {
            PrintStream mineTXT = new PrintStream(file1);
            mineTXT.println("Hej med jer");
            mineTXT.println("Hej med dig selv");
            mineTXT.println("taler du dansk");
            mineTXT.println("Nej jeg taler fransk");
            mineTXT.println("\n"+ "når det er sejt");
            mineTXT.println("NåNå tihi");
            mineTXT.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        File file = new File("output.txt");

        try {
            PrintStream outfile = new PrintStream(file);
            outfile.println("Here's one line.");
            outfile.println("And here' another.");
            outfile.println("\n"+"And a final line.");
            outfile.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
