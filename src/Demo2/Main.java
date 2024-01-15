package Demo2;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    Film film;
    Producer producer;
    private void run() {
        Producer producer = new Producer("Strangers", " By Phillib Banks");
        Film film = new Film("Strangers, Release date ");

        System.out.println(film.getFilmtitle() + film.getUdgivelsesAar() + producer.getProducerName());


        film.save();
        producer.saveProducers();



    }
}
