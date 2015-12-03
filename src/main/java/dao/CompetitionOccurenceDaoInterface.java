package dao;
import data.CompetitionOccurenceData;

import data.CompetitionData;

import java.sql.Date;
import java.util.List;

/**
 * Created by silviana campian on 12/3/2015.
 */
public interface CompetitionOccurenceDaoInterface {
    void createCompetitionOccurence(CompetitionOccurenceData competitionOccurenceData);
    void updateCompetitionOccurence(CompetitionOccurenceData competitionOccurenceData);
    void deleteCompetitionOccurence(CompetitionOccurenceData competitionOccurenceData);
    void deleteCompetitionOccurence(Integer id);
    CompetitionOccurenceData readCompetitionOccurence(Integer id);
    List<CompetitionOccurenceData> readAllCompetitionOccurences();
    List<CompetitionOccurenceData> readCompetitionOccurencesByCompetition(CompetitionData competitionData);
    List<CompetitionOccurenceData> readCompetitionOccurencesByDate(Date date);
    List<CompetitionOccurenceData> readCompetitionOccurencesByLocation(String location);
    List<CompetitionOccurenceData> readCompetitionOccurencesByYear(Integer year);
    List<CompetitionOccurenceData> readCompetitionOccurencesByTeamNumber(Integer teamNumber);
}
