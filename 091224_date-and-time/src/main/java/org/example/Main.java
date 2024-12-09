package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.MonthDay;


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

        // Example instance of Animal
        Animal myAnimal = new Animal();
        myAnimal.setName("Buddy");
        myAnimal.setBirthday(MonthDay.of(12, 25));

        // Print the result
        System.out.println("Animal Name: " + myAnimal.getName());
        System.out.println("Days until next birthday: " + myAnimal.daysUntilNextBirthday());

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


// BONUS: Data types for time

// The departure time of an airplane:
//Data Type: ZonedDateTime
//Justification: Includes both the time and the time zone, necessary for handling flights crossing time zones.
//
//The times on a bus schedule:
//Data Type: LocalTime
//Justification: Represents the time of day without requiring date or time zone, suitable for fixed local schedules.
//
//When the emergency call arrives at the central office:
//Data Type: Instant
//Justification: Records a precise timestamp in UTC, independent of time zones, ideal for logging events.
//
//When Easter takes place in the year 2022:
//Data Type: LocalDate
//Justification: Represents a date-only event without a specific time or time zone.
//
//How long a ticket with a 1-day validity lasts:
//Data Type: Duration
//Justification: Captures a span of time, specifically one day, which is duration-based.
//
//The date next to a signature (contract management software):
//Data Type: LocalDate
//Justification: Represents a date-only context, where time and time zones are irrelevant.
//
//When New Year's Eve is (on January 1st at 00:00, regardless of location):
//Data Type: LocalDateTime
//Justification: Represents the same date and time worldwide, without time zone considerations.
//
//When the video call is:
//Data Type: ZonedDateTime
//Justification: Accounts for participants in different time zones, requiring precise time and zone information.

