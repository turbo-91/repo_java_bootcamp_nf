package org.example;

public enum DaysOfWeek {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekday;

    DaysOfWeek(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String whatKindaDay() {
        return isWeekday ? this.name() : "Weekend";
    }

}
