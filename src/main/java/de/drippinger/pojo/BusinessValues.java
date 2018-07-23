package de.drippinger.pojo;

import java.time.ZonedDateTime;

/**
 * A POJO holding business values.
 *
 * @author Dennis Rippinger (msg systems ag) 2018
 */
public class BusinessValues {

    private String id;

    private String name;

    private ZonedDateTime time;

    public BusinessValues(String id, String name, ZonedDateTime time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }
}
