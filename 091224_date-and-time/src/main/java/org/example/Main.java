package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        // Step 1
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Step 2
        LocalDateTime newDateTime = currentDateTime.plusWeeks(2);
        System.out.println("Date and Time after 2 weeks: " + newDateTime);

        // Step 3
        LocalDate futureDate = LocalDate.of(2024, 12, 25);
        LocalDate today = LocalDate.now();
        if (today.isBefore(futureDate)) {
            System.out.println("The current date is before " + futureDate + ", which is Christmas.");
        } else if (today.isAfter(futureDate)) {
            System.out.println("The current date is after " + futureDate + ", which is Christmas.");
        } else {
            System.out.println("The current date is the same as " + futureDate + ", which is Christmas.");
        }

        // Step 4
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 31);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Difference in days between " + startDate + " and " + endDate + ": " + daysBetween);
    }
}

// RESEARCH

// How can you increase or decrease a LocalDate by one day in Java?

// import java.time.LocalDate;
//
// public class Main {
//    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
//
//        // Increase by one day
//        LocalDate tomorrow = today.plusDays(1);
//
//        // Decrease by one day
//        LocalDate yesterday = today.minusDays(1);
//
//        System.out.println("Today: " + today);
//        System.out.println("Tomorrow: " + tomorrow);
//        System.out.println("Yesterday: " + yesterday);
//    }
// }

// ------------------------------------------------------------------------------------------------------------------------------------

// You are building a birthday reminder app. It should remind you of possible birthdays of your friends at 10:00 in the morning.
// Which data type would be optimal for storing the birthdays of your friends?

// java.time.MonthDay is ideal for storing birthdays because it represents a month and day without requiring a year,
// which fits the use case for recurring birthday reminders.

// import java.time.MonthDay;
//
// public class Main {
//    public static void main(String[] args) {
//        MonthDay birthday = MonthDay.of(12, 25); // Example: December 25
//        System.out.println("Birthday: " + birthday);
//    }
// }

// ------------------------------------------------------------------------------------------------------------------------------------

// You are building an online "Mensch Ärgere Dich Nicht" game. On the website, you can arrange games with friends from all over the world.
// In which data format would you store the timestamps of upcoming games?

// Zulu in ISO 8601 format (e.g., 2024-12-09T10:15:30Z) for timestamps.
// Timestamps are stored in Zulu time to maintain a single source of truth.
// Players’ local times are calculated dynamically using their time zones, ensuring that games are arranged
// without confusion about time zone differences.

// ------------------------------------------------------------------------------------------------------------------------------------

// In your banking software, you want to keep track of when a user has accepted the terms and conditions. How would you best store
// the timestamp of the click?

// I'd Use the java.time.Instant class for precise timestamps, as it stores the moment of the event in UTC.

// ------------------------------------------------------------------------------------------------------------------------------------

// An airplane takes off at 13:00 and lands at 17:00. It was traveling for 8 hours. How is that possible?

// This is possible because the airplane crosses time zones. For example, it could depart from a location at 13:00 (UTC+0) and arrive
// at 17:00 (UTC+4), resulting in an 8-hour flight despite the apparent 4-hour difference in local times.