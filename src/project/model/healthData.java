package project.model;

import javafx.beans.property.*;



import java.sql.Date;
import java.sql.Time;

public class healthData {
    //Declaring Table Columns
    private IntegerProperty welfare_ID;
    private StringProperty welfare_elephant;
    private StringProperty welfare_observer;
    private SimpleObjectProperty<Date> welfare_date;
    private SimpleObjectProperty<Time> welfare_starttime;
    private StringProperty welfare_weather;
    private StringProperty welfare_mahout;
    private StringProperty welfare_bitingflies;
    private StringProperty welfare_wounds;
    private StringProperty welfare_smells;
    private StringProperty welfare_scratching;
    private StringProperty welfare_irritation;
    private StringProperty welfare_irritationtype;
    private StringProperty welfare_debris;
    private StringProperty welfare_drainage;
    private StringProperty welfare_discolouration;
    private StringProperty welfare_mouthsmells;
    private StringProperty welfare_toenails;
    private StringProperty welfare_locomotion;
    private StringProperty welfare_blisters;
    private StringProperty welfare_footleg;
    private StringProperty welfare_sweating;
    private StringProperty welfare_stereotypy;
    private IntegerProperty welfare_frequency;
    private StringProperty welfare_faecesround;
    private StringProperty welfare_strangesmell;
    private StringProperty welfare_parasites;
    private StringProperty welfare_bloodmucas;
    private StringProperty welfare_frequentmovement;
    private StringProperty welfare_appedtite;
    private StringProperty welfare_exploration;
    private StringProperty welfare_mating;
    private IntegerProperty welfare_head;
    private IntegerProperty welfare_shoulder;
    private IntegerProperty welfare_ribs;
    private IntegerProperty welfare_flank;
    private IntegerProperty welfare_spine;
    private IntegerProperty welfare_pelvis;


    //Constructor

    public healthData() {
        this.welfare_ID = new SimpleIntegerProperty();
        this.welfare_elephant = new SimpleStringProperty();
        this.welfare_observer = new SimpleStringProperty();
        this.welfare_date = new SimpleObjectProperty();
        this.welfare_starttime = new SimpleObjectProperty();
        this.welfare_weather = new SimpleStringProperty();
        this.welfare_mahout = new SimpleStringProperty();
        this.welfare_bitingflies = new SimpleStringProperty();
        this.welfare_wounds = new SimpleStringProperty();
        this.welfare_smells = new SimpleStringProperty();
        this.welfare_scratching = new SimpleStringProperty();
        this.welfare_irritation = new SimpleStringProperty();
        this.welfare_irritationtype = new SimpleStringProperty();
        this.welfare_debris = new SimpleStringProperty();
        this.welfare_drainage = new SimpleStringProperty();
        this.welfare_discolouration = new SimpleStringProperty();
        this.welfare_mouthsmells = new SimpleStringProperty();
        this.welfare_toenails = new SimpleStringProperty();
        this.welfare_locomotion = new SimpleStringProperty();
        this.welfare_blisters = new SimpleStringProperty();
        this.welfare_footleg = new SimpleStringProperty();
        this.welfare_sweating = new SimpleStringProperty();
        this.welfare_stereotypy = new SimpleStringProperty();
        this.welfare_frequency = new SimpleIntegerProperty();
        this.welfare_faecesround = new SimpleStringProperty();
        this.welfare_strangesmell = new SimpleStringProperty();
        this.welfare_parasites = new SimpleStringProperty();
        this.welfare_bloodmucas = new SimpleStringProperty();
        this.welfare_frequentmovement = new SimpleStringProperty();
        this.welfare_appedtite = new SimpleStringProperty();
        this.welfare_exploration = new SimpleStringProperty();
        this.welfare_mating = new SimpleStringProperty();
        this.welfare_head = new SimpleIntegerProperty();
        this.welfare_shoulder = new SimpleIntegerProperty();
        this.welfare_ribs = new SimpleIntegerProperty();
        this.welfare_flank = new SimpleIntegerProperty();
        this.welfare_spine = new SimpleIntegerProperty();
        this.welfare_pelvis = new SimpleIntegerProperty();


    }

    //welfare ID

    public int getwelfareID() {
        return welfare_ID.get();
    }

    public void setWelfare_ID(int welfare_id) {
        this.welfare_ID.set(welfare_id);
    }

    public IntegerProperty welfareIDProperty() {
        return welfare_ID;
    }

    public String getwelfareobserver() {
        return welfare_observer.get();
    }

    public void setWelfare_Observer(String welfare_observer) {
        this.welfare_observer.set(welfare_observer);
    }

    public StringProperty welfareObserverProperty() {
        return welfare_observer;
    }

    public Object getwelfare_date() {
        return welfare_date.get();
    }

    public void setWelfare_date(Date welfare_date) {
        this.welfare_date.set(welfare_date);
    }

    public SimpleObjectProperty<Date> welfaredateProperty() {
        return welfare_date;
    }

    public Object getwelfare_starttime() {
        return welfare_starttime.get();
    }

    public void setWelfare_starttime(Time welfare_starttime) {
        this.welfare_starttime.set(welfare_starttime);
    }

    public SimpleObjectProperty<Time> welfaretimeProperty() {
        return welfare_starttime;
    }

    public String getwelfareelephant() {
        return welfare_elephant.get();
    }

    public void setWelfare_Elephant(String welfare_elephant) {
        this.welfare_elephant.set(welfare_elephant);
    }

    public StringProperty welfareElephantProperty() {
        return welfare_elephant;
    }

    public String getwelfareweather() {
        return welfare_weather.get();
    }

    public void setWelfare_weather(String welfare_weather) {
        this.welfare_weather.set(welfare_weather);
    }

    public StringProperty welfareWeatherProperty() {
        return welfare_weather;
    }

    public String getwelfaremahout() {
        return welfare_mahout.get();
    }

    public void setWelfare_mahout(String welfare_mahout) {
        this.welfare_mahout.set(welfare_mahout);
    }

    public StringProperty welfaremahoutProperty() {
        return welfare_mahout;
    }

    public String getwelfarebitingflies() {
        return welfare_bitingflies.get();
    }

    public void setWelfare_bitingflies(String welfare_bitingflies) {
        this.welfare_mahout.set(welfare_bitingflies);
    }

    public StringProperty welfarebitingfliesProperty() {
        return welfare_bitingflies;
    }

    public String getwelfarewounds() {
        return welfare_wounds.get();
    }

    public void setWelfare_wounds(String welfare_wounds) {
        this.welfare_wounds.set(welfare_wounds);
    }

    public StringProperty welfarewoundsProperty() {
        return welfare_wounds;
    }

    public String getwelfarescratching() {
        return welfare_scratching.get();
    }

    public void setWelfare_scratching(String welfare_scratching) {
        this.welfare_scratching.set(welfare_scratching);
    }

    public StringProperty welfarescratchingProperty() {
        return welfare_scratching;
    }

    public String getwelfaresmells() {
        return welfare_smells.get();
    }

    public void setWelfare_smells(String welfare_smells) {
        this.welfare_smells.set(welfare_smells);
    }

    public StringProperty welfaresmellsProperty() {
        return welfare_smells;
    }

    public String getwelfareirritation() {
        return welfare_irritation.get();
    }

    public void setWelfare_irritation(String welfare_irritation) {
        this.welfare_irritation.set(welfare_irritation);
    }

    public StringProperty welfareirritationProperty() {
        return welfare_irritation;
    }

    public String getwelfareirritationtype() {
        return welfare_irritationtype.get();
    }

    public void setWelfare_irritationtype(String welfare_irritationtype) {
        this.welfare_irritationtype.set(welfare_irritationtype);
    }

    public StringProperty welfareirritationtypeProperty() {
        return welfare_irritationtype;
    }

    public String getwelfaredebris() {
        return welfare_debris.get();
    }

    public void setWelfare_debris(String welfare_debris) {
        this.welfare_debris.set(welfare_debris);
    }

    public StringProperty welfaredebrisProperty() {
        return welfare_debris;
    }

    public String getwelfaredrainage() {
        return welfare_drainage.get();
    }

    public void setWelfare_drainage(String welfare_drainage) {
        this.welfare_drainage.set(welfare_drainage);
    }

    public StringProperty welfaredrainageProperty() {
        return welfare_drainage;
    }

    public String getwelfaresdiscolouration() {
        return welfare_discolouration.get();
    }

    public void setWelfare_discolouration(String welfare_discolouration) {
        this.welfare_discolouration.set(welfare_discolouration);
    }

    public StringProperty welfarediscolourationProperty() {
        return welfare_discolouration;
    }

    public String getwelfaremouthsmells() {
        return welfare_mouthsmells.get();
    }

    public void setWelfare_mouthsmells(String welfare_mouthsmells) {
        this.welfare_mouthsmells.set(welfare_mouthsmells);
    }

    public StringProperty welfaremouthsmellsProperty() {
        return welfare_mouthsmells;
    }

    public String getwelfaretoenails() {
        return welfare_toenails.get();
    }

    public void setWelfare_toenails(String welfare_toenails) {
        this.welfare_toenails.set(welfare_toenails);
    }

    public StringProperty welfaretoenailsProperty() {
        return welfare_toenails;
    }

    public String getwelfarelocomotion() {
        return welfare_locomotion.get();
    }

    public void setWelfare_locomotion(String welfare_locomotion) {
        this.welfare_locomotion.set(welfare_locomotion);
    }

    public StringProperty welfarelocomotionProperty() {
        return welfare_locomotion;
    }

    public String getwelfareblisters() {
        return welfare_blisters.get();
    }

    public void setWelfare_blisters(String welfare_blisters) {
        this.welfare_blisters.set(welfare_blisters);
    }

    public StringProperty welfareblistersProperty() {
        return welfare_blisters;
    }

    public String getwelfarefootleg() {
        return welfare_footleg.get();
    }

    public void setWelfare_footleg(String welfare_footleg) {
        this.welfare_footleg.set(welfare_footleg);
    }

    public StringProperty welfarefootlegProperty() {
        return welfare_footleg;
    }

    public String getwelfaresweating() {
        return welfare_sweating.get();
    }

    public void setWelfare_sweating(String welfare_sweating) {
        this.welfare_sweating.set(welfare_sweating);
    }

    public StringProperty welfaresweatingProperty() {
        return welfare_sweating;
    }

    public String getwelfarestereotypy() {
        return welfare_stereotypy.get();
    }

    public void setWelfare_stereotypy(String welfare_stereotypy) {
        this.welfare_stereotypy.set(welfare_stereotypy);
    }

    public StringProperty welfarestereotypyProperty() {
        return welfare_stereotypy;
    }

    public int getwelfarefrequency() {
        return welfare_frequency.get();
    }

    public void setWelfare_frequency(int welfare_frequency) {
        this.welfare_frequency.set(welfare_frequency);
    }

    public IntegerProperty welfarefrequencyProperty() {
        return welfare_frequency;
    }

    public String getwelfarefaecesround() {
        return welfare_faecesround.get();
    }

    public void setWelfare_faecesround(String welfare_faecesround) {
        this.welfare_faecesround.set(welfare_faecesround);
    }

    public StringProperty welfarefaecesroundProperty() {
        return welfare_faecesround;
    }

    public String getwelfarestrangesmell() {
        return welfare_strangesmell.get();
    }

    public void setWelfare_strangesmell(String welfare_strangesmell) {
        this.welfare_strangesmell.set(welfare_strangesmell);
    }

    public StringProperty welfarestrangesmellProperty() {
        return welfare_strangesmell;
    }

    public String getwelfareparasites() {
        return welfare_parasites.get();
    }

    public void setWelfare_parasites(String welfare_parasites) {
        this.welfare_parasites.set(welfare_parasites);
    }

    public StringProperty welfareparasitesProperty() {
        return welfare_parasites;
    }

    public String getwelfarebloodmucas() {
        return welfare_bloodmucas.get();
    }

    public void setWelfare_bloodmucas(String welfare_bloodmucas) {
        this.welfare_bloodmucas.set(welfare_bloodmucas);
    }

    public StringProperty welfarebloodmucasProperty() {
        return welfare_bloodmucas;
    }

    public String getwelfarefrequentmovement() {
        return welfare_frequentmovement.get();
    }

    public void setWelfare_frequentmovement(String welfare_frequentmovement) {
        this.welfare_frequentmovement.set(welfare_frequentmovement);
    }

    public StringProperty welfarefrequentmovementProperty() {
        return welfare_frequentmovement;
    }

    public String getwelfareappedtite() {
        return welfare_appedtite.get();
    }

    public void setWelfare_appedtite(String welfare_appedtite) {
        this.welfare_appedtite.set(welfare_appedtite);
    }

    public StringProperty welfareappedtiteProperty() {
        return welfare_appedtite;
    }

    public String getwelfareexploration() {
        return welfare_exploration.get();
    }

    public void setWelfare_exploration(String welfare_exploration) {
        this.welfare_exploration.set(welfare_exploration);
    }

    public StringProperty welfareexplorationProperty() {
        return welfare_exploration;
    }

    public String getwelfaremating() {
        return welfare_mating.get();
    }

    public void setWelfare_mating(String welfare_mating) {
        this.welfare_mating.set(welfare_mating);
    }

    public StringProperty welfarematingProperty() {
        return welfare_mating;
    }

    public int getwelfarehead() {
        return welfare_head.get();
    }

    public void setWelfare_head(int welfare_head) {
        this.welfare_head.set(welfare_head);
    }

    public IntegerProperty welfareheadProperty() {
        return welfare_head;
    }

    public int getwelfareshoulder() {
        return welfare_shoulder.get();
    }

    public void setWelfare_shoulder(int welfare_shoulder) {
        this.welfare_shoulder.set(welfare_shoulder);
    }

    public IntegerProperty welfareshoulderProperty() {
        return welfare_shoulder;
    }

    public int getwelfareribs() {
        return welfare_ribs.get();
    }

    public void setWelfare_ribs(int welfare_ribs) {
        this.welfare_ribs.set(welfare_ribs);
    }

    public IntegerProperty welfareribsProperty() {
        return welfare_ribs;
    }

    public int getwelfareflank() {
        return welfare_flank.get();
    }

    public void setWelfare_flank(int welfare_flank) {
        this.welfare_flank.set(welfare_flank);
    }

    public IntegerProperty welfareflankProperty() {
        return welfare_flank;
    }

    public int getwelfarespine() {
        return welfare_spine.get();
    }

    public void setWelfare_spine(int welfare_spine) {
        this.welfare_spine.set(welfare_spine);
    }

    public IntegerProperty welfarespineProperty() {
        return welfare_spine;
    }

    public int getwelfarepelvis() {
        return welfare_pelvis.get();
    }

    public void setWelfare_pelvis(int welfare_pelvis) {
        this.welfare_pelvis.set(welfare_pelvis);
    }

    public IntegerProperty welfarepelvisProperty() {
        return welfare_pelvis;
    }
}





