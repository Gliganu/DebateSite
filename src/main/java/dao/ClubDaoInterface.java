package dao;

import data.ClubData;

import java.util.List;

/**
 * Created by silviana campian on 12/3/2015.
 */
public interface ClubDaoInterface {
    void createClub(ClubData clubData);
    void updateClub(ClubData clubData);
    void deleteClub(ClubData clubData);
    void deleteClub(Integer id);
    ClubData readClub(Integer id);
    List<ClubData> readAllClubs();
    List<ClubData> readClubsByCity(String city);
    List<ClubData> readClubsByName(String namePattern);
}
