package Demo10;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    BMI bmi;

    public boolean isUnderWeight() {
        if (bmi.calculate() <18.5) {
            System.out.println("Is under weight");
            return true;
        }
        return false;
    }

    public boolean isNormalWeight() {
        double bmiValue = bmi.calculate();
        if (bmiValue >= 18.5 && bmiValue <= 25) {
            System.out.println("Is normal weight");
            return true;
        }
        return false;
    }

    public boolean IsOverWeight() {
        if (bmi.calculate() > 25) {
            System.out.println("is overweight");
            return true;
        }
        return false;
    }

    public void save() {
        File file = new File("BMI.txt");

        try {
            PrintStream ps = new PrintStream(new FileOutputStream(file, true));
            ps.println("Your BMI is: "+ bmi.calculate());
            ps.println("Normal weight: " + isNormalWeight());
            ps.println("Over weight: " + IsOverWeight());
            ps.println("Under weight: " + isUnderWeight());
            ps.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void run() {
        bmi = new BMI(65, 165);
        System.out.println("BMI: " + bmi.calculate());

        isNormalWeight();
        isUnderWeight();
        IsOverWeight();
        save();
    }
}
