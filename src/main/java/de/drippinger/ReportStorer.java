package de.drippinger;

import de.drippinger.pojo.BusinessValues;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Business requires to create CSV based reports on the filesystem.
 *
 * @author Dennis Rippinger (msg systems ag) 2018
 */
public class ReportStorer {

    public void writeReportTo(File file, List<BusinessValues> values) {

        try (PrintWriter pw = new PrintWriter(file)) {
            StringBuilder sb = new StringBuilder();

            sb.append("id");
            sb.append(',');
            sb.append("Name");
            sb.append(',');
            sb.append("Time");
            sb.append('\n');

            for (BusinessValues value : values) {
                sb.append(value.getId());
                sb.append(',');
                sb.append(value.getName());
                sb.append(',');
                sb.append(value.getTime());
                sb.append('\n');
            }

            pw.write(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
