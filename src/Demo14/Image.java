package Demo14;

import java.io.File;
import java.util.ArrayList;

public class Image {
    private String fileName;
    private double width;
    private double height;

    Image(String fileName, double width, double height) {
     this.fileName = fileName;
     this.width = width;
     this.height = height;
    }


    public String getFileName() {
        return fileName;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    public  boolean isKnownFileType() {
        String lowercaseFileName = fileName.toLowerCase();

        ArrayList<String> extension = new ArrayList<>();
        extension.add(".gif");
        extension.add(".jpg");
        extension.add(".jpeg");
        extension.add(".png");
        extension.add(".webp");
        extension.add("bmp");

        for (String validExtension: extension ) {
            if (lowercaseFileName.endsWith(validExtension)) {
                return true;
            }
        }
        return false;


    }

    public boolean isPortrait() {
         return height < width;
        }


    public boolean isLandscape() {
        return height > width;
        }




}
