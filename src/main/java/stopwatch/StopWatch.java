package stopwatch;

public class StopWatch {
    int hours;
    int minutes;
    public void record(int minutes) {
        if (minutes >= 0) {
            this.minutes = minutes;
        }

        if (minutes >= 60) {
            hours = minutes / 60;
            minutes = minutes % 60;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }
}
