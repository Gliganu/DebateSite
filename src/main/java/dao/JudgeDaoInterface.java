package dao;

import data.ClubData;
import data.JudgeData;

import java.util.List;

/**
 * Created by silviana campian on 12/3/2015.
 */
public interface JudgeDaoInterface {
    void createJudge(JudgeData judgeData);
    void updateJudge(JudgeData judgeData);
    void deleteJudge(JudgeData judgeData);
    void deleteJudge(Integer id);
    JudgeData readJudge(Integer id);
    List<JudgeData> readAllJudges();
    List<JudgeData> readJudgesByFirstName(String firstName);
    List<JudgeData> readJudgesByLastName(String lastName);
    List<JudgeData> readJudgesByClub(ClubData clubData);

}
