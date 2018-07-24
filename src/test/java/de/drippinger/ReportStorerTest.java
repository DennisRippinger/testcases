package de.drippinger;

import de.drippinger.pojo.BusinessValues;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.contentOf;

/**
 * @author Dennis Rippinger (msg systems ag) 2018
 */
public class ReportStorerTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    ReportStorer storer = new ReportStorer();

    @Test
    public void writeReportTo() throws IOException {
        List<BusinessValues> objects = new ArrayList<>();
        objects.add(new BusinessValues("1", "test", ZonedDateTime.now()));
        File file = folder.newFile();

        storer.writeReportTo(file, objects);

        assertThat(contentOf(file)).contains("test");

    }
}
