package HogwartsStudents;

import java.util.ArrayList;
import java.util.Collections;

public class MainHogwarts {
    public static void main(String[] args) {
        new MainHogwarts().run();
    }

    private void run() {
        HogwartsStudent hogwartsStudent = new HogwartsStudent("Slytherin ", "Yens ", "ravenclaw");
        HogwartsStudent hogwartsStudent1 = new HogwartsStudent("Harry ", "Potter " , "slytherin" );


        System.out.println(hogwartsStudent.getFirstName() + hogwartsStudent.getLastName() + hogwartsStudent.getHouse());
        System.out.println(hogwartsStudent1.getFirstName() + hogwartsStudent1.getLastName() + hogwartsStudent1.getHouse());

        hogwartsStudent.setHouse(hogwartsStudent.getHouse());
        hogwartsStudent1.setHouse(hogwartsStudent1.getHouse());

        ArrayList<String> lastNames = new ArrayList<>();
        lastNames.add(hogwartsStudent.getLastName());
        lastNames.add(hogwartsStudent1.getLastName());

        Collections.sort(lastNames);

        for (String lastName : lastNames) {
            System.out.println(lastName);
        }


    }
}
