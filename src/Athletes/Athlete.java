package Athletes;

public class Athlete {
    private String name;
    private int points;
    private boolean isActive;


    public Athlete(String name, boolean isActive, int points) {
        this.name = name;
        this.isActive = isActive;
        this.points = points;
    }

    public Athlete() {

    }
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public boolean isActive() {
        return isActive;
    }
}
