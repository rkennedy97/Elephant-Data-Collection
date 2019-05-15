package project.model;

import javafx.beans.property.*;

import java.sql.Date;

public class dataAdd {
    //Declaring Table Columns
    private IntegerProperty healthID;
    private StringProperty observer;
    private SimpleObjectProperty<Date> date;
    private StringProperty elephant;
    private StringProperty healthy;

    //Constructor

    public dataAdd(){
        this.healthID = new SimpleIntegerProperty();
        this.observer = new SimpleStringProperty();
        this.date = new SimpleObjectProperty();
        this.elephant = new SimpleStringProperty();
        this.healthy = new SimpleStringProperty();
    }

    //healthID

    public int getHealthID(){
        return healthID.get();
    }

    public void setHealthID(int healthID){
        this.healthID.set(healthID);
    }

    public IntegerProperty healthIDProperty(){
        return healthID;
    }
    //Observer

    public String getObserver(){
        return observer.get();
    }

    public void setObserver(String observer){
        this.observer.set(observer);
    }

    public StringProperty observerProperty() {
        return observer;
    }


    //date
    public Object getDate(){
        return date.get();
    }

    public void setDate(Date date){
        this.date.set(date);
    }

    public SimpleObjectProperty<Date> dateProperty(){
        return date;
    }

    //Elephant

    public String getElephant(){
        return elephant.get();
    }

    public void setElephant(String elephant){
        this.elephant.set(elephant);
    }

    public StringProperty elephantProperty() {
        return elephant;
    }

    //healthy

    public String getHealthy(){
        return healthy.get();
    }

    public void setHealthy(String healthy){
        this.healthy.set(healthy);
    }

    public StringProperty healthyProperty(){
        return healthy;
    }
}
