package org.example;

public enum DaysOfWeek {

    MONDAY ("Weekday", true),
    TUESDAY ("Weekday", true),
    WEDNESDAY ("Weekday", true),
    THURSDAY ("Weekday", true),
    FRIDAY ("Weekday", true),
    SATURDAY ("Weekend", false),
    SUNDAY ("Weekend", false);

    private final String weekDay;
    private final boolean isWeekday;


    DaysOfWeek(String weekDay, boolean isWeekday) {
        this.weekDay = weekDay;
        this.isWeekday = isWeekday;
    }

    @Override
    public String toString() {
        return this.name();
    }

    public String whatKindaDay(){
        if (this.isWeekday){
            return this.toString();
        }
        return this.weekDay;
    }

}
