package project.JavaFx;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class scheduleController {

    @FXML
    private DatePicker picker;

    @FXML
    private Button saveButton;

    @FXML
    private TextArea notes;

    //mapping between dates and notes, maps the date to the strings.
    private Map<LocalDate, String> data = new HashMap<>();

    public void initialize(){

        load();
        picker.valueProperty().addListener((o, oldDate, date) -> {
            notes.setText(data.getOrDefault(date, "")); // Get date or return empty string. Get or default is a convience method.
        });

        picker.setValue(LocalDate.now());
    }

    public void updateNotes(){
        data.put(picker.getValue(), notes.getText());

    }
//saving notes to a file then retrieving them when needed.
    @FXML
    private void save() {
        try (ObjectOutputStream stream = new ObjectOutputStream(Files.newOutputStream(Paths.get("notes.data")))) {
            stream.writeObject(data);
            System.out.println("Note Saved!");

        } catch (IOException e) {
            System.out.println("Notes failed to save. Please be aware of following error -> " + e);
        }
    }

    private void load(){ //first taking reference to the file to check if it exists
        Path files = Paths.get("notes.data");

        if (Files.exists(files)){
            try (ObjectInputStream stream = new ObjectInputStream(Files.newInputStream(files))){
                data = (Map<LocalDate, String>) stream.readObject();
                System.out.println("Note Loaded!");

            }
            catch (Exception e){
                System.out.println("Notes failed to load" + e);
            }
        }

    }

    public void exit(){
        save();
        Platform.exit();
    }


}
