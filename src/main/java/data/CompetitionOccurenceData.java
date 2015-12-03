package data;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by silviana campian on 11/27/2015.
 */
class CompetitionOccurenceData implements Serializable {
    private Integer competitionOccurenceId;
    private CompetitionData competition;
    private ArrayList<MatchData> matches;

    public CompetitionOccurenceData() {
    }

    private Date date;
    private String location;
    private Integer teamNumber;

    public Integer getCompetitionOccurenceId() {
        return competitionOccurenceId;
    }

    public void setCompetitionOccurenceId(Integer competitionOccurenceId) {
        this.competitionOccurenceId = competitionOccurenceId;
    }

    public CompetitionData getCompetition() {
        return competition;
    }

    public void setCompetition(CompetitionData competition) {
        this.competition = competition;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(Integer teamNumber) {
        this.teamNumber = teamNumber;
    }

    public ArrayList<MatchData> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<MatchData> matches) {
        this.matches = matches;
    }
}
