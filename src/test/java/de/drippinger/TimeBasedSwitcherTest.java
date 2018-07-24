package de.drippinger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;

import static java.time.ZonedDateTime.now;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Dennis Rippinger (msg systems ag) 2018
 */
@RunWith(Parameterized.class)
public class TimeBasedSwitcherTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {now(), "Just Now"},
                {now().plusSeconds(2), "Just Now"},
                {now().plusMinutes(1), "Just Recently"},
                {now().plusMinutes(2), "Near Past"},
                {now().plusMinutes(20), "Old"}
        });
    }

    private TimeBasedSwitcher switcher = new TimeBasedSwitcher();

    @Parameterized.Parameter(0)
    public ZonedDateTime time;

    @Parameterized.Parameter(1)
    public String result;

    @Test
    public void getKeyToTime() {
        // GIVEN: Our Parameters

        // WHEN: We execute our logic
        String keyToTime = switcher.getKeyToTime(time);

        // THEN: Key is equal to result
        assertThat(keyToTime).isEqualTo(result);

    }
}
