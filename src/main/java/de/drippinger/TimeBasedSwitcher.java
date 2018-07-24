package de.drippinger;

import java.time.ZonedDateTime;

import static java.time.ZonedDateTime.now;

/**
 * @author Dennis Rippinger (msg systems ag) 2018
 */
public class TimeBasedSwitcher {

    public String getKeyToTime(ZonedDateTime time) {
        ZonedDateTime now = now();
        ZonedDateTime inAMinute = now.plusMinutes(1L);
        ZonedDateTime inTwoMinutes = now.plusMinutes(2L);
        ZonedDateTime inTenMinutes = now.plusMinutes(10L);

        if (time.isEqual(now) || time.isBefore(inAMinute)) {
            return "Just Now";
        } else if (time.isEqual(inAMinute) || time.isBefore(inTwoMinutes)) {
            return "Just Recently";
        } else if (time.isEqual(inTwoMinutes) || time.isBefore(inTenMinutes)) {
            return "Near Past";
        }

        return "Old";

    }
}
