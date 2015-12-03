package data;

/**
 * Created by silviana campian on 11/27/2015.
 */
public class MatchData {
    private Integer matchId;
    private JudgeData judge;
    private CompetitionOccurenceData competition;

    public MatchData() {
    }

    private DebaterData gov1;
    private Integer scoreGov1;
    private DebaterData gov2;
    private Integer scoreGov2;
    private DebaterData gov3;
    private Integer scoreGov3;
    private DebaterData op1;
    private Integer scoreOp1;
    private DebaterData op2;
    private Integer scoreOp2;
    private DebaterData op3;
    private Integer scoreOp3;

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public JudgeData getJudge() {
        return judge;
    }

    public void setJudge(JudgeData judge) {
        this.judge = judge;
    }

    public CompetitionOccurenceData getCompetition() {
        return competition;
    }

    public void setCompetition(CompetitionOccurenceData competition) {
        this.competition = competition;
    }

    public DebaterData getGov1() {
        return gov1;
    }

    public void setGov1(DebaterData gov1) {
        this.gov1 = gov1;
    }

    public Integer getScoreGov1() {
        return scoreGov1;
    }

    public void setScoreGov1(Integer scoreGov1) {
        this.scoreGov1 = scoreGov1;
    }

    public DebaterData getGov2() {
        return gov2;
    }

    public void setGov2(DebaterData gov2) {
        this.gov2 = gov2;
    }

    public Integer getScoreGov2() {
        return scoreGov2;
    }

    public void setScoreGov2(Integer scoreGov2) {
        this.scoreGov2 = scoreGov2;
    }

    public DebaterData getGov3() {
        return gov3;
    }

    public void setGov3(DebaterData gov3) {
        this.gov3 = gov3;
    }

    public Integer getScoreGov3() {
        return scoreGov3;
    }

    public void setScoreGov3(Integer scoreGov3) {
        this.scoreGov3 = scoreGov3;
    }

    public DebaterData getOp1() {
        return op1;
    }

    public void setOp1(DebaterData op1) {
        this.op1 = op1;
    }

    public Integer getScoreOp1() {
        return scoreOp1;
    }

    public void setScoreOp1(Integer scoreOp1) {
        this.scoreOp1 = scoreOp1;
    }

    public DebaterData getOp2() {
        return op2;
    }

    public void setOp2(DebaterData op2) {
        this.op2 = op2;
    }

    public Integer getScoreOp2() {
        return scoreOp2;
    }

    public void setScoreOp2(Integer scoreOp2) {
        this.scoreOp2 = scoreOp2;
    }

    public DebaterData getOp3() {
        return op3;
    }

    public void setOp3(DebaterData op3) {
        this.op3 = op3;
    }

    public Integer getScoreOp3() {
        return scoreOp3;
    }

    public void setScoreOp3(Integer scoreOp3) {
        this.scoreOp3 = scoreOp3;
    }
}
