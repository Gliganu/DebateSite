package data;

import java.io.Serializable;

/**
 * Created by silviana campian on 11/27/2015.
 */
public class JudgeData implements Serializable {
    private Integer judgeId;
    private String firstName;
    private String lastName;
    private ClubData club;
    private DebaterData debater;

    public JudgeData() {
    }

    public Integer getJudgeId() {

        return judgeId;
    }

    public void setJudgeId(Integer judgeId) {
        this.judgeId = judgeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public DebaterData getDebater() {
        return debater;
    }

    public void setDebater(DebaterData debater) {
        this.debater = debater;
    }
}
