package project.JavaFx;


/*public class Controller implements Initializable {
    public TextField text_users;
    public TextField text_ele;
    public Label label_users;
    public Label label_ele;
    final ObservableList options = FXCollections.observableArrayList();
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DropDown dropDown = new DropDown();

    @FXML
    private Label dbstatus;

   // @FXML
   // private ComboBox<obsOption> dropObs;

    @FXML
    private ComboBox<obsEle> dropEle;

    @FXML
    private ComboBox<obsScore> dropScore1;
//    private ComboBox<obsScore> dropScore2;


    ComboBox dropObs = new ComboBox();



    public void initialize(URL url, ResourceBundle rb) {
        if (this.dropDown.isDatabaseConnected()) {
            this.dbstatus.setText("Connected To Database");
        } else {
            this.dbstatus.setText("Not Connected To Database");
        }
        this.dropObs.setItems(FXCollections.observableArrayList(obsOption.values()));
        this.dropEle.setItems(FXCollections.observableArrayList(obsEle.values()));
        this.dropScore1.setItems(FXCollections.observableArrayList(obsScore.values()));
        //     this.dropScore2.setItems(FXCollections.observableArrayList(obsScore.values()));


    }

    private void combobox()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            String sql = "select * from user_table";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                String name = rs.getString("fname");
                dropObs.toString();
            }

        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }


    public void radioButtons(){
        ToggleGroup Group1 = new ToggleGroup();
        ToggleGroup Group2 = new ToggleGroup();
        ToggleGroup Group3 = new ToggleGroup();
        ToggleGroup Group4 = new ToggleGroup();
        ToggleGroup Group5 = new ToggleGroup();

        RadioButton radioY1 = new RadioButton("select first");
        radioY1.setToggleGroup(Group1);
        radioY1.setSelected(true);
        RadioButton radioN1 = new RadioButton("select second");
        radioN1.setToggleGroup(Group1);

        RadioButton radioY2 = new RadioButton("select first");
        radioY1.setToggleGroup(Group2);
        radioY1.setSelected(true);
        RadioButton radioN2 = new RadioButton("select second");
        radioN1.setToggleGroup(Group2);

        RadioButton radioY3 = new RadioButton("select first");
        radioY1.setToggleGroup(Group3);
        radioY1.setSelected(true);
        RadioButton radioN3 = new RadioButton("select second");
        radioN1.setToggleGroup(Group3);

        RadioButton radioY4 = new RadioButton("select first");
        radioY1.setToggleGroup(Group4);
        radioY1.setSelected(true);
        RadioButton radioN4 = new RadioButton("select second");
        radioN1.setToggleGroup(Group4);

        RadioButton radioY5 = new RadioButton("select first");
        radioY1.setToggleGroup(Group5);
        radioY1.setSelected(true);
        RadioButton radioN5 = new RadioButton("select second");
        radioN1.setToggleGroup(Group5);


    }


    public void dropObs(ActionEvent actionEvent) throws SQLException {

       //ComboBox<String> choiceBox = new ComboBox<>(options);

       // ComboBox.getItems().addAll("SELECT user_fname FROM `user_table`");

    }

    public void addValues(ActionEvent actionEvent) throws SQLException {


        dbConnect dbConnect = new dbConnect();
        Connection connection = dbConnect.getConnection();

        String sql1 = "INSERT INTO ELEPHANT VALUES ('" + text_ele.getText() + "')";
        String sql2 = "INSERT INTO USERNAME VALUES ('" + text_users.getText() + "')";

        Statement statement1 = connection.createStatement();
        statement1.executeUpdate(sql1);

        Statement statement2 = connection.createStatement();
        statement2.executeUpdate(sql2);

        ComboBox comboBox = new ComboBox();

    }



    public void dropEle(ActionEvent actionEvent) throws SQLException {

    }

    public void dropScore(ActionEvent actionEvent) throws SQLException {

    }
    public void dropDate(ActionEvent actionEvent) throws SQLException {

    }
    public void dropGPS(ActionEvent actionEvent) throws SQLException {

    }
    public void dropStime(ActionEvent actionEvent) throws SQLException {

    }
    public void dropWea(ActionEvent actionEvent) throws SQLException {

    }
    public void dropMaho(ActionEvent actionEvent) throws SQLException {

    }

}*/
