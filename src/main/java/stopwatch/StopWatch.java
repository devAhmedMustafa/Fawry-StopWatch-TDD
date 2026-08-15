package stopwatch;

public class StopWatch {
    int hours;
    int minutes;
    int days;

    int hoursInDay = 24;

    public void record(int minutes) {
        if (minutes >= 0) {
            this.minutes = minutes;
        }

        if (minutes >= 60) {
            hours = minutes / 60;
            minutes = minutes % 60;
        }

        if (hours >= hoursInDay) {
            days = hours / hoursInDay;
            hours = hours % hoursInDay;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getDays() {
        return days;
    }

    public int setHoursInDay(int hoursInDay) {
        return this.hoursInDay = hoursInDay;
    }
}
