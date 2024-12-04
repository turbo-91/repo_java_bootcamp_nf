package org.example;

public enum Weekdays {

    MONDAY ("Workday", true),
    TUESDAY ("Workday", true),
    WEDNESDAY ("Workday", false),
    THURSDAY ("Workday", true),
    FRIDAY ("Workday", true),
    SATURDAY ("Weekend", false),
    SUNDAY ("Weekend", false);

    private final String whatDay;
    private final boolean hasToWork;

    Weekdays(String whatDay, boolean hasToWork) {
        this.whatDay = whatDay;
        this.hasToWork = hasToWork;
    }

    public String getWhatDay() {
        return whatDay;
    }

    public boolean isHasToWork() {
        return hasToWork;
    }
}
