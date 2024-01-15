package Demo10;

public class BMI {
    private double height;
    private double weight;

    public BMI( double weight, double height) {
       this.weight = weight;
       this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double calculate() {
        return weight / Math.pow(height / 100 , 2);
    }

}
