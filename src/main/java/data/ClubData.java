package data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by silviana campian on 11/27/2015.
 */
public class ClubData implements Serializable {
    private Integer clubId;
    private String name;
    private String city;
    private ArrayList<JudgeData> judges;
    private ArrayList<DebaterData> debaters;
    private ArrayList<CompetitionData> competitions;

    public ClubData() {
    }

    public Integer getClubId() {

        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public ArrayList<JudgeData> getJudges() {
        return judges;
    }

    public void setJudges(ArrayList<JudgeData> judges) {
        this.judges = judges;
    }

    public ArrayList<DebaterData> getDebaters() {
        return debaters;
    }

    public void setDebaters(ArrayList<DebaterData> debaters) {
        this.debaters = debaters;
    }

    public ArrayList<CompetitionData> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(ArrayList<CompetitionData> competitions) {
        this.competitions = competitions;
    }

}
