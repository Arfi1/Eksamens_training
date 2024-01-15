package Demo7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    Names names;
    public void save() {
        File file = new File("Names.txt");

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(file, true));
            ps.println(names);
            ps.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void run() {
        Names namesWithMiddleName = new Names("Anders Dave Bolvid");
        System.out.println(namesWithMiddleName.toString());
        this.names = namesWithMiddleName;
        save();

        Names namesWithOutMiddleName = new Names("Anders toBelo");
        System.out.println(namesWithOutMiddleName.toString());
        this.names = namesWithOutMiddleName;
        save();

    }
}
