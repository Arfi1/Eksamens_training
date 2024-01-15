package Athletes;

public class ProfessionalAthlete extends Athlete {

    private int numberOfWins;

    public ProfessionalAthlete(String name, boolean isActive, int points) {
        super(name, isActive, points);
        this.numberOfWins = 0;
    }

    public int getNumberOfWins() {
        return numberOfWins;

    }

    public void win(){
        numberOfWins++;
    }
}
