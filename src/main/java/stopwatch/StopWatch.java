package stopwatch;

public class StopWatch {
    int hours;
    int minutes;
    int days;
    public void record(int minutes) {
        if (minutes >= 0) {
            this.minutes = minutes;
        }

        if (minutes >= 60) {
            hours = minutes / 60;
            minutes = minutes % 60;
        }

        if (hours >= 24) {
            days = hours / 24;
            hours = hours % 24;
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
}
