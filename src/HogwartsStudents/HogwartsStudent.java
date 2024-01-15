package HogwartsStudents;

import java.util.ArrayList;

public class HogwartsStudent implements Comparable<HogwartsStudent> {
    private String firstName;
    private String lastName;
    private String house;


    public HogwartsStudent(String firstName, String lastName, String house) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        if (isVaildHouse(house)) {
            this.house = house;
        } else {
            System.out.println("Invalid house name");
        }
    }

    private boolean isVaildHouse(String house) {

        ArrayList<String> houseNames = new ArrayList<>();
        houseNames.add("Ravenclaw");
        houseNames.add("Gryffindor");
        houseNames.add("Hufflepuff");
        houseNames.add("Slytherin");

        for(String names: houseNames) {
            if (house.equalsIgnoreCase(names))
                return true;
        }
       return false;
    }

    

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", house='" + house + '\'' +
                '}';
    }

    @Override
    public int compareTo(HogwartsStudent o) {
        return this.lastName.compareTo(o.lastName);
    }
}
