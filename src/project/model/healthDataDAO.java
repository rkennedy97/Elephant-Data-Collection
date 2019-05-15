package project.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import project.connect.DBUtil;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;


//Code heavily edited from SW Test Academy -  https://www.swtestacademy.com/database-operations-javafx/

public class healthDataDAO {


    public static healthData searchHealthEntry (String welfareID) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM welfare_table WHERE welfare_ID="+welfareID;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsHealth = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getHealthRecordFromResultSet method and get HealthRecord object
            healthData HealthData = getHealthDataFromResultSet(rsHealth);

            //Return HealthRecord object
            return HealthData;
        } catch (SQLException e) {
            System.out.println("While searching an HealthRecord with " + welfareID + " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }

    //Use ResultSet from DB as parameter and set HealthRecord Object's attributes and return HealthRecord object.
    private static healthData getHealthDataFromResultSet(ResultSet rs) throws SQLException
    {
        healthData hea = null;
        if (rs.next()) {
            hea = new healthData();
            hea.setWelfare_ID(rs.getInt("welfare_ID"));
            hea.setWelfare_Observer(rs.getString("welfare_observer"));
            hea.setWelfare_date(rs.getDate("welfare_date"));
            hea.setWelfare_frequency(rs.getInt("welfare_frequency"));
            hea.setWelfare_head(rs.getInt("welfare_head"));
            hea.setWelfare_shoulder(rs.getInt("welfare_shoulder"));
            hea.setWelfare_ribs(rs.getInt("welfare_ribs"));
            hea.setWelfare_flank(rs.getInt("welfare_flank"));
            hea.setWelfare_spine(rs.getInt("welfare_spine"));
            hea.setWelfare_pelvis(rs.getInt("welfare_pelvis"));
            hea.setWelfare_starttime(rs.getTime("welfare_starttime"));

            hea.setWelfare_weather(rs.getString("welfare_weather"));
            hea.setWelfare_mahout(rs.getString("welfare_mahout"));
            hea.setWelfare_bitingflies(rs.getString("welfare_bitingflies"));
            hea.setWelfare_wounds(rs.getString("welfare_wounds"));
            hea.setWelfare_smells(rs.getString("welfare_smells"));
            hea.setWelfare_scratching(rs.getString("welfare_scratching"));
            hea.setWelfare_irritation(rs.getString("welfare_irritation"));
            hea.setWelfare_irritationtype(rs.getString("welfare_irritationtype"));
            hea.setWelfare_debris(rs.getString("welfare_debris"));
            hea.setWelfare_drainage(rs.getString("welfare_drainage"));
            hea.setWelfare_discolouration(rs.getString("welfare_discolouration"));
            hea.setWelfare_mouthsmells(rs.getString("welfare_mouthsmells"));
            hea.setWelfare_toenails(rs.getString("welfare_toenails"));
            hea.setWelfare_locomotion(rs.getString("welfare_locomotion"));
            hea.setWelfare_blisters(rs.getString("welfare_blisters"));
            hea.setWelfare_footleg(rs.getString("welfare_footleg"));
            hea.setWelfare_sweating(rs.getString("welfare_sweating"));
            hea.setWelfare_stereotypy(rs.getString("welfare_stereotypy"));
            hea.setWelfare_faecesround(rs.getString("welfare_faecesround"));
            hea.setWelfare_strangesmell(rs.getString("welfare_strangesmell"));
            hea.setWelfare_parasites(rs.getString("welfare_parasites"));
            hea.setWelfare_bloodmucas(rs.getString("welfare_bloodmucas"));
            hea.setWelfare_frequentmovement(rs.getString("welfare_frequentmovement"));
            hea.setWelfare_appedtite(rs.getString("welfare_appedtite"));
            hea.setWelfare_exploration(rs.getString("welfare_exploration"));
            hea.setWelfare_mating(rs.getString("welfare_mating"));

        }
        return hea;
    }

    //SELECT an healthEntry

    public static ObservableList<healthData> searchHealthEntries () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM welfare_table";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsHealth = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getHealthRecordList method and get HealthRecord object
            ObservableList<healthData> healthList = getHealthList(rsHealth);

            //Return HealthRecord object
            return healthList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from welfare records operation
    private static ObservableList<healthData> getHealthList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of welfare objects
        ObservableList<healthData> healthList = FXCollections.observableArrayList();

        while (rs.next()) {
            healthData hea = new healthData();
            hea.setWelfare_ID(rs.getInt("welfare_ID"));
            hea.setWelfare_Observer(rs.getString("welfare_observer"));
            hea.setWelfare_Elephant(rs.getString("welfare_elephant"));
            hea.setWelfare_date(rs.getDate("welfare_date"));
            hea.setWelfare_frequency(rs.getInt("welfare_frequency"));
            hea.setWelfare_head(rs.getInt("welfare_head"));
            hea.setWelfare_shoulder(rs.getInt("welfare_shoulder"));
            hea.setWelfare_ribs(rs.getInt("welfare_ribs"));
            hea.setWelfare_flank(rs.getInt("welfare_flank"));
            hea.setWelfare_spine(rs.getInt("welfare_spine"));
            hea.setWelfare_pelvis(rs.getInt("welfare_pelvis"));
            hea.setWelfare_starttime(rs.getTime("welfare_starttime"));

            hea.setWelfare_weather(rs.getString("welfare_weather"));
            hea.setWelfare_mahout(rs.getString("welfare_mahout"));
            hea.setWelfare_bitingflies(rs.getString("welfare_bitingflies"));
            hea.setWelfare_wounds(rs.getString("welfare_wounds"));
            hea.setWelfare_smells(rs.getString("welfare_smells"));
            hea.setWelfare_scratching(rs.getString("welfare_scratching"));
            hea.setWelfare_irritation(rs.getString("welfare_irritation"));
            hea.setWelfare_irritationtype(rs.getString("welfare_irritationtype"));
            hea.setWelfare_debris(rs.getString("welfare_debris"));
            hea.setWelfare_drainage(rs.getString("welfare_drainage"));
            hea.setWelfare_discolouration(rs.getString("welfare_discolouration"));
            hea.setWelfare_mouthsmells(rs.getString("welfare_mouthsmells"));
            hea.setWelfare_toenails(rs.getString("welfare_toenails"));
            hea.setWelfare_locomotion(rs.getString("welfare_locomotion"));
            hea.setWelfare_blisters(rs.getString("welfare_blisters"));
            hea.setWelfare_footleg(rs.getString("welfare_footleg"));
            hea.setWelfare_sweating(rs.getString("welfare_sweating"));
            hea.setWelfare_stereotypy(rs.getString("welfare_stereotypy"));
            hea.setWelfare_faecesround(rs.getString("welfare_faecesround"));
            hea.setWelfare_strangesmell(rs.getString("welfare_strangesmell"));
            hea.setWelfare_parasites(rs.getString("welfare_parasites"));
            hea.setWelfare_bloodmucas(rs.getString("welfare_bloodmucas"));
            hea.setWelfare_frequentmovement(rs.getString("welfare_frequentmovement"));
            hea.setWelfare_appedtite(rs.getString("welfare_appedtite"));
            hea.setWelfare_exploration(rs.getString("welfare_exploration"));
            hea.setWelfare_mating(rs.getString("welfare_mating"));
            //Add welfare statistics to the ObservableList
            healthList.add(hea);
        }
        //return welfare list (ObservableList of welfare records)
        return healthList;
    }

    //UPDATE an welfare record
    //*************************************
    public static void updateHealthList (String welfare_ID , String welfare_observer, String welfare_elephant, String welfare_weather, String welfare_mahout) throws SQLException, ClassNotFoundException {

        //Declare a UPDATE statement
        String updateStmt =
                "BEGIN\n" +
                        "   UPDATE welfare_table\n" +
                        "      SET welfare_observer = '" + welfare_observer + "'\n" +
                        "      SET welfare_elephant = '" + welfare_elephant + "'\n" +
                        "      SET welfare_weather = '" + welfare_weather + "'\n" +
                        "      SET welfare_mahout = '" + welfare_mahout + "'\n" +
                        "    WHERE welfare_ID = " + welfare_ID + ";\n" +
                        "END;";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }

    //DELETE a welfare record
    //*************************************
    public static void deleteHealthwithID (String welfare_ID) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                "BEGIN\n" +
                        "   DELETE FROM welfare_table\n" +
                        "         WHERE welfare_ID ="+ welfare_ID +";\n" +
                        "   COMMIT;\n" +
                        "END;";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            throw e;
        }
    }

    //INSERT an welfare record
    //*************************************
    public static void insertHealthEntry (String welfare_ID, String welfare_elephant, String welfare_observer, Date welfare_date, Time welfare_starttime, String welfare_weather, String welfare_mahout,
                                          String welfare_bitingflies, String welfare_wounds, String welfare_smells, String welfare_scratching, String welfare_irritation, String welfare_irritationtype,
                                          String welfare_debris, String welfare_drainage, String welfare_discolouration, String welfare_mouthsmells, String welfare_toenails, String welfare_locomotion,
                                          String welfare_blisters, String welfare_footleg, String welfare_sweating, String welfare_stereotypy, String welfare_frequency, String welfare_faecesround,
                                          String welfare_strangesmell, String welfare_parasites, String welfare_bloodmucas, String welfare_frequentmovement, String welfare_appedtite,
                                          String welfare_exploration, String welfare_mating, String welfare_head, String welfare_shoulder, String welfare_ribs, String welfare_flank,
                                          String welfare_spine, String welfare_pelvis
                                          ) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                "BEGIN\n" +
                        "INSERT INTO welfare_table\n" +
                        "(welfare_ID, welfare_elephant, welfare_observer, welfare_date, welfare_starttime, welfare_weather, welfare_mahout, welfare_bitingflies, welfare_wounds, " +
                        "welfare_smells, welfare_scratching, welfare_irritation, welfare_irritationtype, welfare_debris, welfare_drainage, welfare_discolouration, welfare_mouthsmells, welfare_toenails, " +
                        "welfare_locomotion, welfare_blisters, welfare_footleg, welfare_sweating, welfare_stereotypy, welfare_frequency, welfare_faecesround, welfare_strangesmell, welfare_parasites, " +
                        "welfare_bloodmucas, welfare_frequentmovement, welfare_appedtite, welfare_exploration, welfare_mating, welfare_head, welfare_shoulder, welfare_ribs, welfare_flank, " +
                        "welfare_spine, welfare_pelvis)\n" +
                        "VALUES\n" +
                        "('0', '"+welfare_ID+"','"+welfare_elephant+"','"+welfare_observer+"', '"+welfare_date+"','"+welfare_starttime+"','" +welfare_weather+"', " +
                        "'" +welfare_mahout+"', '"+welfare_bitingflies+"','"+welfare_wounds+"','" +welfare_smells+"', " +
                        "'" +welfare_scratching+"', '"+welfare_irritation+"','"+welfare_irritationtype+"','" +welfare_debris+"'," +
                        "'" +welfare_drainage+"', '"+welfare_discolouration+"','"+welfare_mouthsmells+"','" +welfare_toenails+"'," +
                        "'" +welfare_locomotion+"', '"+welfare_blisters+"','"+welfare_footleg+"','" +welfare_sweating+"'," +
                        "'" +welfare_stereotypy+"', '"+welfare_frequency+"','"+welfare_faecesround+"','" +welfare_strangesmell+"'," +
                        "'" +welfare_parasites+"', '"+welfare_bloodmucas+"','"+welfare_frequentmovement+"','" +welfare_appedtite+"'," +
                        "'" +welfare_exploration+"', '"+welfare_mating+"','"+welfare_head+"','" +welfare_shoulder+"'," +
                        "'" +welfare_ribs+"', '"+welfare_flank+"','"+welfare_spine+"','" +welfare_pelvis+"'," +
                        " );\n" +
                        "END;";

        //Execute DELETE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            throw e;
        }
    }




}
