package stopwatch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StopWatchTest {

    @Test
    void recordWhenMinutesIsPositiveThenMinutesAreSet() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(14);
        int minutes = stopWatch.getMinutes();
        Assertions.assertEquals(14, minutes);
    }

    @Test
    void recordWhenMinutesIsNegativeThenNoChange() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(-5);
        int minutes = stopWatch.getMinutes();
        Assertions.assertEquals(0, minutes);
    }

}
