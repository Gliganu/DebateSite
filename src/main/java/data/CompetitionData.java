package data;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by silviana campian on 11/27/2015.
 */
public class CompetitionData implements Serializable {
    private Integer competitionId;
    private String name;
    private ClubData club;
    private ArrayList<CompetitionOccurenceData> occurances;

    public CompetitionData() {
    }

    private Date startYear;
    private Boolean active;


    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClubData getClub() {
        return club;
    }

    public void setClub(ClubData club) {
        this.club = club;
    }

    public Date getStartYear() {
        return startYear;
    }

    public void setStartYear(Date startYear) {
        this.startYear = startYear;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ArrayList<CompetitionOccurenceData> getOccurances() {
        return occurances;
    }

    public void setOccurances(ArrayList<CompetitionOccurenceData> occurances) {
        this.occurances = occurances;
    }

}
