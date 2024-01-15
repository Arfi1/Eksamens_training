package Athletes;

public class AmateurAthlete extends Athlete {
    private boolean hasPaidFee;

    public AmateurAthlete(String name, boolean isActive, int points) {
        super(name, isActive, points);
        this.hasPaidFee = false;
    }

    public void hasPaidFee() {

        this.hasPaidFee = true;
    }

    public boolean getHasPaidFee() {
        return hasPaidFee;
    }
}
