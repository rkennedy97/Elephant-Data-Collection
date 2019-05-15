package project.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import project.connect.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
//Code heavily edited from SW Test Academy -  https://www.swtestacademy.com/database-operations-javafx/


public class dataAddDAO {

    //*******************************
    //SELECT an healthEntry
    //*******************************
    public static dataAdd searchHealthEntry (String healthID) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM health_dataadd WHERE healthID="+healthID;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsHealth = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getHealthRecordFromResultSet method and get HealthRecord object
            dataAdd DataAdd = getDataAddFromResultSet(rsHealth);

            //Return HealthRecord object
            return DataAdd;
        } catch (SQLException e) {
            System.out.println("While searching an HealthRecord with " + healthID + " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }

    //Use ResultSet from DB as parameter and set HealthRecord Object's attributes and return HealthRecord object.
    private static dataAdd getDataAddFromResultSet(ResultSet rs) throws SQLException
    {
        dataAdd hea = null;
        if (rs.next()) {
            hea = new dataAdd();
            hea.setHealthID(rs.getInt("healthID"));
            hea.setObserver(rs.getString("observer"));
            hea.setDate(rs.getDate("date"));
            hea.setElephant(rs.getString("elephant"));
            hea.setHealthy(rs.getString("healthy"));
        }
        return hea;
    }

    //*******************************
    //SELECT SearchHealthEntry
    //*******************************
    public static ObservableList<dataAdd> searchHealthEntries () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM health_dataadd";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsHealth = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getHealthRecordList method and get HealthRecord object
            ObservableList<dataAdd> healthList = getHealthList(rsHealth);

            //Return HealthRecord object
            return healthList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from HealthRecords operation
    private static ObservableList<dataAdd> getHealthList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises of HealthRecord objects
        ObservableList<dataAdd> healthList = FXCollections.observableArrayList();

        while (rs.next()) {
            dataAdd hea = new dataAdd();
            hea.setHealthID(rs.getInt("healthID"));
            hea.setObserver(rs.getString("Observer"));
            hea.setDate(rs.getDate("date"));
            hea.setElephant(rs.getString("elephant"));
            hea.setHealthy(rs.getString("healthy"));
            //Add HealthRecord to the ObservableList
            healthList.add(hea);
        }
        //return empList (ObservableList of HealthRecords)
        return healthList;
    }

    //*************************************
    //UPDATE Health Record's
    //*************************************
    public static void updateHealthList (String healthID, String healthObserver, String healthElephant) throws SQLException, ClassNotFoundException {

        //Declare a UPDATE statement
        String updateStmt =
                "BEGIN\n" +
                        "   UPDATE health_dataadd\n" +
                        "      SET observer = '" + healthObserver + "'\n" +
                        "      SET elephant = '" + healthElephant + "'\n" +
                        "    WHERE healthID = " + healthID + ";\n" +
                        "END;";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }

    //*************************************
    //DELETE an HealthRecord
    //*************************************
    public static void deleteHealthwithID (String healthID) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                "BEGIN\n" +
                        "   DELETE FROM health_dataadd\n" +
                        "         WHERE healthID ="+ healthID +";\n" +
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

    //*************************************
    //INSERT an health record
    //*************************************
    public static void insertHealthEntry (String healthObserver, String healthElephant, String healthHealthy) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt =
                "BEGIN\n" +
                        "INSERT INTO health_dataadd\n" +
                        "(healthID, observer, elephant, healthy)\n" +
                        "VALUES\n" +
                        "('0', '"+healthObserver+"','"+healthElephant+"','" +healthHealthy+"',);\n" +
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
