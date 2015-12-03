package dao;

import data.ClubData;
import data.DebaterData;

import java.util.List;

/**
 * Created by silviana campian on 12/3/2015.
 */
public interface DebaterDaoInterface {
    void createDebater(DebaterData debaterData);
    void updateDebater(DebaterData debaterData);
    void deleteDebater(DebaterData debaterData);
    void deleteDebater(Integer id);
    DebaterData readDebater(Integer id);
    List<DebaterData> readAllDebaters();
    List<DebaterData> readDebatersByFirstName();
    List<DebaterData> readDebatersByLastName();
    List<DebaterData> readDebatersByClub(ClubData clubData);
}
