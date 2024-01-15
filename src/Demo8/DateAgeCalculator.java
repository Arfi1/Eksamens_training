package Demo8;

import java.time.LocalDate;
import java.util.Arrays;

public class DateAgeCalculator {
    private int yourAge;
    private LocalDate dateAge;

    public DateAgeCalculator ( int yourAge, LocalDate dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;

    }

    public int calculateTheLowestAcceptableDateAge() {
        int lowest = yourAge / 2 +7;
        return lowest;
    }

    public boolean isDateTooYoung () {
        int lowestAcceptableAge = calculateTheLowestAcceptableDateAge();
        LocalDate lowestAcceptableDate = LocalDate.now().minusYears(lowestAcceptableAge);
        return dateAge.isBefore(lowestAcceptableDate);
    }

}
