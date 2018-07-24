package de.drippinger;

import de.drippinger.repository.TimeRepository;

import javax.inject.Inject;
import java.time.ZonedDateTime;

import static java.time.ZonedDateTime.now;

/**
 * Some business logic that contains a vastly complicated business logic
 * to calculate the next important business day. The business hasn't
 * decided yet what the logic should be, so for testing it is somewhat
 * of now().
 *
 * @author Dennis Rippinger (msg systems ag) 2018
 */
public class DateService {

    @Inject
    private TimeRepository repository;

    public ZonedDateTime calculateDateBasedOn() {
        ZonedDateTime result = now();

        // Do other fancy stuff.
        // Like store the value!
        String id = repository.storeTime(result);

        return result;
    }

}
