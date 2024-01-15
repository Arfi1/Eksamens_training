package Demo2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Producer extends Film{

    private String producerName;

    public Producer(String filmtitle, String producerName) {
        super(filmtitle);
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void saveProducers() {
        File file = new File("Producers.txt");

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(file, true));
            ps.println("Producer name: " + getProducerName());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
