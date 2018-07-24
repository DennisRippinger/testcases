package de.drippinger.repository;

import java.time.ZonedDateTime;

/**
 * Repository to store our time objects in the database.
 *
 * @author Dennis Rippinger (msg systems ag) 2018
 */
public class TimeRepository {

    public String storeTime(ZonedDateTime dateTime) {

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "1";
    }

}
