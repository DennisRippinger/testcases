package de.drippinger;

import de.drippinger.repository.TimeRepository;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.time.ZonedDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Dennis Rippinger (msg systems ag) 2018
 */
@RunWith(CdiRunner.class)
public class DateServiceTest {

    @Inject
    private DateService service;

    @Mock
    @Produces
    private TimeRepository repository;

    @Test
    public void calculateDateBasedOn() {
        when(repository.storeTime(any())).thenReturn("1");


        ZonedDateTime zonedDateTime = service.calculateDateBasedOn();

        assertThat(zonedDateTime).isEqualToIgnoringSeconds(ZonedDateTime.now());
    }
}
