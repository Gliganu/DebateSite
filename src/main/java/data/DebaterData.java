package data;

import java.io.Serializable;

/**
 * Created by silviana campian on 11/27/2015.
 */
public class DebaterData implements Serializable {
    private Integer debaterId;
    private String firstName;
    private String lastName;
    private ClubData club;

    public DebaterData() {
    }

    public Integer getDebaterId() {
        return debaterId;
    }

    public void setDebaterId(Integer debaterId) {
        this.debaterId = debaterId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ClubData getClub() {
        return club;
    }

    public void setClub(ClubData club) {
        this.club = club;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

