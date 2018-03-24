public enum Day {

    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);

    private final double dayValue;

    Day(double dayValue) {
        this.dayValue = dayValue; }

        public double getDayValue() {
                return this.dayValue; }

}


