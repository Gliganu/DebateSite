package dao;

import data.CompetitionOccurenceData;
import data.DebaterData;
import data.JudgeData;
import data.MatchData;

import java.util.List;

/**
 * Created by silviana campian on 12/3/2015.
 */
public interface MatchDaoInterface {
    void createMatch(MatchData matchData);
    void updateMatch(MatchData matchData);
    void deleteMatch(MatchData matchData);
    void deleteMatch(Integer id);
    MatchData readMatch(Integer id);
    List<MatchData> readAllMatches();
    List<MatchData> readMatchesByCompetitionOccurence(CompetitionOccurenceData competitionOccurenceData);
    List<MatchData> readMatchesByJudge(JudgeData judgeData);
    List<MatchData> readMatchesByDebater(DebaterData debaterData);
}
