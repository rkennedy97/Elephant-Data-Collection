package project.JavaFx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import project.model.healthData;
import project.model.healthDataDAO;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;


public class healthDataController {

    @FXML
    private TextField welfaretxt;

    @FXML
    private TextField elephanttxt;

    @FXML
    private TextField observertxt;

    @FXML
    private TableView welfareTable;

    @FXML
    private TextField weathertxt;

    @FXML
    private TextField mahouttxt;


    @FXML
    private TableColumn<healthData, Integer> c11;
    @FXML
    private TableColumn<healthData, String> c21;
    @FXML
    private TableColumn<healthData, String> c31;
    @FXML
    private TableColumn<healthData, Date> c41;
    @FXML
    private TableColumn<healthData, Time> c51;
    @FXML
    private TableColumn<healthData, String> c61;
    @FXML
    private TableColumn<healthData, String> c71;
    @FXML
    private TableColumn<healthData, String> c81;
    @FXML
    private TableColumn<healthData, String> c91;
    @FXML
    private TableColumn<healthData, String> c101;
    @FXML
    private TableColumn<healthData, String> c111;
    @FXML
    private TableColumn<healthData, String> c121;
    @FXML
    private TableColumn<healthData, String> c131;
    @FXML
    private TableColumn<healthData, String> c141;
    @FXML
    private TableColumn<healthData, String> c151;
    @FXML
    private TableColumn<healthData, String> c161;
    @FXML
    private TableColumn<healthData, String> c171;
    @FXML
    private TableColumn<healthData, String> c181;
    @FXML
    private TableColumn<healthData, String> c191;
    @FXML
    private TableColumn<healthData, String> c201;
    @FXML
    private TableColumn<healthData, String> c211;
    @FXML
    private TableColumn<healthData, String> c221;
    @FXML
    private TableColumn<healthData, String> c231;
    @FXML
    private TableColumn<healthData, Integer> c241;
    @FXML
    private TableColumn<healthData, String> c251;
    @FXML
    private TableColumn<healthData, String> c261;
    @FXML
    private TableColumn<healthData, String> c271;
    @FXML
    private TableColumn<healthData, String> c281;
    @FXML
    private TableColumn<healthData, String> c291;
    @FXML
    private TableColumn<healthData, String> c301;
    @FXML
    private TableColumn<healthData, String> c311;
    @FXML
    private TableColumn<healthData, String> c321;
    @FXML
    private TableColumn<healthData, Integer> c331;
    @FXML
    private TableColumn<healthData, Integer> c341;
    @FXML
    private TableColumn<healthData, Integer> c351;
    @FXML
    private TableColumn<healthData, Integer> c361;
    @FXML
    private TableColumn<healthData, Integer> c371;
    @FXML
    private TableColumn<healthData, Integer> c381;




    @FXML
    private void initialize () {

        c11.setCellValueFactory(cellData -> cellData.getValue().welfareIDProperty().asObject());
        c21.setCellValueFactory(cellData -> cellData.getValue().welfareElephantProperty());
        c31.setCellValueFactory(cellData -> cellData.getValue().welfareObserverProperty());
        c41.setCellValueFactory(cellData -> cellData.getValue().welfaredateProperty());
        c51.setCellValueFactory(cellData -> cellData.getValue().welfaretimeProperty());
        c61.setCellValueFactory(cellData -> cellData.getValue().welfareWeatherProperty());
        c71.setCellValueFactory(cellData -> cellData.getValue().welfaremahoutProperty());
        c81.setCellValueFactory(cellData -> cellData.getValue().welfarebitingfliesProperty());
        c91.setCellValueFactory(cellData -> cellData.getValue().welfarewoundsProperty());
        c101.setCellValueFactory(cellData -> cellData.getValue().welfaresmellsProperty());
        c111.setCellValueFactory(cellData -> cellData.getValue().welfarescratchingProperty());
        c121.setCellValueFactory(cellData -> cellData.getValue().welfareirritationProperty());
        c131.setCellValueFactory(cellData -> cellData.getValue().welfareirritationtypeProperty());
        c141.setCellValueFactory(cellData -> cellData.getValue().welfaredebrisProperty());
        c151.setCellValueFactory(cellData -> cellData.getValue().welfaredrainageProperty());
        c161.setCellValueFactory(cellData -> cellData.getValue().welfarediscolourationProperty());
        c171.setCellValueFactory(cellData -> cellData.getValue().welfaremouthsmellsProperty());
        c181.setCellValueFactory(cellData -> cellData.getValue().welfaretoenailsProperty());
        c191.setCellValueFactory(cellData -> cellData.getValue().welfarelocomotionProperty());
        c201.setCellValueFactory(cellData -> cellData.getValue().welfareblistersProperty());
        c211.setCellValueFactory(cellData -> cellData.getValue().welfarefootlegProperty());
        c221.setCellValueFactory(cellData -> cellData.getValue().welfaresweatingProperty());
       /* c231.setCellValueFactory(cellData -> cellData.getValue().welfarestereotypyProperty());
        c241.setCellValueFactory(cellData -> cellData.getValue().welfarefrequencyProperty().asObject());
        c251.setCellValueFactory(cellData -> cellData.getValue().welfarefaecesroundProperty());
        c261.setCellValueFactory(cellData -> cellData.getValue().welfarestrangesmellProperty());
        c271.setCellValueFactory(cellData -> cellData.getValue().welfareparasitesProperty());
        c281.setCellValueFactory(cellData -> cellData.getValue().welfarebloodmucasProperty());
        c291.setCellValueFactory(cellData -> cellData.getValue().welfarefrequentmovementProperty());
        c301.setCellValueFactory(cellData -> cellData.getValue().welfareappedtiteProperty());
        c311.setCellValueFactory(cellData -> cellData.getValue().welfareexplorationProperty());
        c321.setCellValueFactory(cellData -> cellData.getValue().welfarematingProperty());
        c331.setCellValueFactory(cellData -> cellData.getValue().welfareheadProperty().asObject());
        c341.setCellValueFactory(cellData -> cellData.getValue().welfareshoulderProperty().asObject());
        c351.setCellValueFactory(cellData -> cellData.getValue().welfareribsProperty().asObject());
        c361.setCellValueFactory(cellData -> cellData.getValue().welfareflankProperty().asObject());
        c371.setCellValueFactory(cellData -> cellData.getValue().welfarespineProperty().asObject());
        c381.setCellValueFactory(cellData -> cellData.getValue().welfarepelvisProperty().asObject());*/



    }

    //Search a record
    @FXML
    private void searchIDData (ActionEvent actionEvent) throws ClassNotFoundException, SQLException {
        try {
            //Get HealthRecord information
            healthData hea = healthDataDAO.searchHealthEntry(welfaretxt.getText());
            //Populate HealthRecord on TableView and Display on TextArea
            populateAndShowHealthData(hea);
        } catch (SQLException e) {
            e.printStackTrace();
            //resultArea.setText("Error occurred while getting data information from DB.\n" + e);
            throw e;
        }
    }

    //Search all records
    @FXML
    private void searchAllData(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            //Get all welfare information
            ObservableList<healthData> heaData = healthDataDAO.searchHealthEntries();
            //Populate HealthRecords on TableView
            populateHealthData(heaData);
        } catch (SQLException e){
            System.out.println("Error occurred while getting HealthRecords information from DB.\n" + e);
            throw e;
        }
    }

    @FXML
    private void populateData (healthData hea) throws ClassNotFoundException {
        //Declare and ObservableList for table view
        ObservableList<healthData> heaData = FXCollections.observableArrayList();
        //Add HealthRecord to the ObservableList
        heaData.add(hea);
        //Set items to the HealthRecordTable
        welfareTable.setItems(heaData);
    }

    @FXML
    private void populateAndShowHealthData(healthData hea) throws ClassNotFoundException {
        if (hea != null) {
            populateData(hea);
            //setHeaInfoToTextArea(hea);
        } else {
            System.out.print("This record does not exist!\n");
        }
    }

    //Populate HealthRecords for TableView
    @FXML
    private void populateHealthData (ObservableList<healthData> heaData) throws ClassNotFoundException {
        //Set items to the HealthRecordTable
        welfareTable.setItems(heaData);
    }

    @FXML
    private void updateData (ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            healthDataDAO.updateHealthList(welfaretxt.getText(),elephanttxt.getText(), observertxt.getText(), weathertxt.getText(), mahouttxt.getText());
        } catch (SQLException e) {
        }
    }

    //Insert an HealthRecord to the DB
  /*  @FXML
    private void insertData (ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {

            healthDataDAO.insertHealthEntry(welfaretxt.getText(), observertxt.getText(),elephanttxt.getText());
          //  resultArea.setText("HealthRecord inserted! \n");
        } catch (SQLException e) {
         //   resultArea.setText("Problem occurred while inserting HealthRecord " + e);
            throw e;
        }
    }*/

    //Delete an HealthRecord with a given HealthRecord Id from DB
    @FXML
    private void deleteData (ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            healthDataDAO.deleteHealthwithID(welfaretxt.getText());
          //  resultArea.setText("HealthRecord deleted! HealthRecord id: " + healthID.getText() + "\n");
        } catch (SQLException e) {
         //   resultArea.setText("Problem occurred while deleting HealthRecord " + e);
            throw e;
        }
    }







}
