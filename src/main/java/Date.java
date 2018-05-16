import static java.lang.Math.floor;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Day getDay() {
        int y = year % 100;
        int c = year / 100;
        int k = day;
        int m = 0;
        if (month == 1 || month == 2) {
            m = month + 10;
        } else {
            m = month - 2;
        }
        double w = (k + floor(2.6 * m - 0.2) - (2 * floor(c)) + y + (floor(y / 4)) + floor(c / 4)) % 7;

        if (w < 0) {
            double x = w + 7;
            w = x % 7;
        }

        Day weekday = null;

        for (Day day : Day.values()) {
            if (w == day.getDayValue()) {
                weekday = day;
            }
        }
        return weekday;
    }

}

