package Demo13;


import java.io.*;
import java.util.Random;

import static javax.swing.text.html.HTML.Tag.U;

public class JuleGave {
    private boolean isSoft;
    private boolean isRectangular;
    private  boolean doesRattle;

    public JuleGave(boolean isSoft, boolean isRectangular, boolean doesRattle){
        this.isSoft = isSoft;
        this.isRectangular = isRectangular;
        this.doesRattle = doesRattle;

    }

    public JuleGave(){
        Random random = new Random();

        this.isSoft = random.nextBoolean();
        this.isRectangular = random.nextBoolean();
        this.doesRattle = random.nextBoolean();

    }

    public boolean couldBeLego(){
        if (isSoft && isRectangular && doesRattle) {
            System.out.println("could be lego");
            return true;
        }
        return false;

    }

    public void save() {

        File file = new File("Julegaver.txt");

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(file, true));

            ps.println("\n"+"JULEGAVER INFORMATION:");
            ps.println("____________________________________");
            ps.println("is soft: " + isSoft);
            ps.println("is rectangular: " + isRectangular);
            ps.println("does rattle: " + doesRattle);
            if (isRectangular && isSoft && doesRattle ) {
                ps.println("\n"+"could be lego \uD83D\uDE04");
            }

            ps.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
