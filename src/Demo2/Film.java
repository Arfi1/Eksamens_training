package Demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.Year;

public class Film {
    private String filmtitle;
    private int udgivelsesAar;

    public Film(String filmtitle, int udgivelsesAar) {
        this.filmtitle = filmtitle;
        this.udgivelsesAar = udgivelsesAar;
    }

    public Film(String filmtitle) {
        this.filmtitle = filmtitle;
        this.udgivelsesAar = Year.now().getValue();
    }

    public String getFilmtitle() {
        return filmtitle;
    }


    public int getUdgivelsesAar() {
        return udgivelsesAar;
    }



    public void save() {
        File file = new File("FilmsAndReleaseDate.txt");

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(file, true));
            ps.println("Movie title: " + getFilmtitle() + getUdgivelsesAar());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
