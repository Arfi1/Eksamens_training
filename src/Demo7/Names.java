package Demo7;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;


    public Names(String fullName) {


        String[] names = fullName.split(" ");

        if (names.length == 1) {
            this.firstName = names[0];
            this.middleName = "";
            this.lastName = "";
        }
        else if (names.length == 2) {
            this.firstName = names[0];
            this.middleName = "";
            this.lastName = names[1];
        }
        else if (names.length == 3) {
            this.firstName = names[0];
            this.middleName = names[1];
            this.lastName = names[2];
        }
        else {
            System.out.println("Write full name again");
        }
    }

    @Override
    public String toString() {
        if (middleName.isEmpty()) {
            return "Names{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        } else {
            return "Names{" +
                    "firstName='" + firstName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }


}
