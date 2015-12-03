package dao;

import data.ClubData;
import data.CompetitionData;

import java.util.List;

/**
 * Created by silviana campian on 12/3/2015.
 */
public interface CompetitionDaoInterface {
    void createCompetiton(CompetitionData competitionData);
    void updateCompetition(CompetitionData competitionData);
    void deleteCompetition(CompetitionData competitionData);
    void deleteCompetition(Integer id);
    CompetitionData readCompetition(Integer id);
    List<CompetitionData> readAllCompetitions();
    List<CompetitionData> readCompetitionsByStartYear();
    List<CompetitionData> readCompetitionsByClub(ClubData clubData);
    List<CompetitionData> readActiveCompetitions();
}
