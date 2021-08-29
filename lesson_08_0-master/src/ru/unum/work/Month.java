package ru.unum.work;

public enum Month {
    JANUARY(23,Season.WINTER),
    FEBRUARY(21,Season.WINTER),
    MARCH(6,Season.WINTER),
    APRIL(12,Season.SPRING),
    JUNE(26,Season.SUMMER),
    JULE(29,Season.SUMMER),
    AUGUST(20,Season.SUMMER),
    SEPTEMBER(34,Season.AUTUMN),
    OCTOBER(23,Season.AUTUMN),
    NOVEMBER(30,Season.SPRING),
    DECEMBER(33,Season.SPRING);

    private int day;
    private Season season;

    Month(int day, Season season) {
        this.day = day;
        this.season = season;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Month{" +
                "day=" + day +
                ", season=" + season +
                '}';
    }
}
