package Demo13;

public class JulegaveResultat {
    public static void main(String[] args) {
        new JulegaveResultat().run();
    }

    JuleGave juleGave;
    private void run() {

        JuleGave randomGift = new JuleGave();
        System.out.println("Random gift - could be lego: " + randomGift.couldBeLego());

        JuleGave ramdomGift1 = new JuleGave();
        System.out.println("Random gift 2 - could be lego: " + ramdomGift1.couldBeLego());

        randomGift.save();
        ramdomGift1.save();

    }
}
