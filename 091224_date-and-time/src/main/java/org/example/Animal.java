package org.example;
import lombok.Data;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

@Data
public class Animal {
    private String name;
    private MonthDay birthday;

    // Method to calculate days until next birthday
    public long daysUntilNextBirthday() {
        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = birthday.atYear(today.getYear());

        // If the birthday this year has already passed, consider the next year
        if (nextBirthday.isBefore(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        return ChronoUnit.DAYS.between(today, nextBirthday);
    }
}
