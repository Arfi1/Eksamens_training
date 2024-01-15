package Demo14;


public class Main {
    public static void main(String[] args) {
        new Main().run();
    }


    private void run() {
        Image image = new Image("example.gif",0, 0);
        Image image1 = new Image("dig.gif", 20, 11);

        if (image.isKnownFileType()) {
            System.out.println("Kendt filetype");
        } else {
            System.out.println("ikke kendt filetype");
        }

        if (image.isPortrait()) {
            System.out.println("Billedet er i portrætorientering");
        } else if (image.isLandscape()){
            System.out.println("Billedet er i landskabsorientering");
        } else {
            System.out.println("Billedet er firkantet");
        }

        System.out.println("_______________________________________________");
        if (image1.isKnownFileType()) {
            System.out.println("Kendt filetype");
        } else {
            System.out.println("ikke kendt filetype");
        }

        if (image1.isPortrait()) {
            System.out.println("Billedet er i portrætorientering");
        } else if (image1.isLandscape()){
            System.out.println("Billedet er i landskabsorientering");
        } else {
            System.out.println("Billedet er firkantet");
        }


    }
}
