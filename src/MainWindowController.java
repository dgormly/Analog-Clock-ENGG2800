import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.SubScene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.*;

/**
 * Created by dgormly on 22/1/17.
 */
public class MainWindowController implements Initializable {

    /* FXML Nodes */
    @FXML
    private RadioButton amRadio;
    @FXML
    private RadioButton pmRadio;
    @FXML
    private Button setTimeButton;
    @FXML
    private TextField hourTextfield;
    @FXML
    private TextField minuteTextfield;
    @FXML
    private Circle hour1;
    @FXML
    private Circle hour2;
    @FXML
    private Circle hour3;
    @FXML
    private Circle hour4;
    @FXML
    private Circle hour5;
    @FXML
    private Circle hour6;
    @FXML
    private Circle hour7;
    @FXML
    private Circle hour8;
    @FXML
    private Circle hour9;
    @FXML
    private Circle hour10;
    @FXML
    private Circle hour11;
    @FXML
    private Circle hour12;
    @FXML
    private Circle minute1;
    @FXML
    private Circle minute2;
    @FXML
    private Circle minute3;
    @FXML
    private Circle minute4;
    @FXML
    private Circle minute5;
    @FXML
    private Circle minute6;
    @FXML
    private Circle minute7;
    @FXML
    private Circle minute8;
    @FXML
    private Circle minute9;
    @FXML
    private Circle minute10;
    @FXML
    private Circle minute11;
    @FXML
    private Circle minute12;

    private int hours;
    private int minutes;

    private Map<Integer, Circle> hourMap = new HashMap<>();
    private Map<Integer, Circle> minuteMap = new HashMap<>();

    /**
     * A function which sets up the button and input field handlers.
     *
     * Ties all of the buttons to the desired method on action.
     *
     * @param location  The location used to resolve relative paths for the root object, or null if
     *                  the location is not known.
     * @param resources The resources used to localize the root object, or null if the root object
     *                  was not localized.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setTimeButton.setOnAction(e -> this.setTime());
        setupMaps();
        setupTime();



    }


    private void setupMaps() {
        hourMap.put(1, hour1);
        hourMap.put(2, hour2);
        hourMap.put(3, hour3);
        hourMap.put(4, hour4);
        hourMap.put(5, hour5);
        hourMap.put(6, hour6);
        hourMap.put(7, hour7);
        hourMap.put(8, hour8);
        hourMap.put(9, hour9);
        hourMap.put(10, hour10);
        hourMap.put(11, hour11);
        hourMap.put(12, hour12);

        minuteMap.put(1, minute1);
        minuteMap.put(2, minute2);
        minuteMap.put(3, minute3);
        minuteMap.put(4, minute4);
        minuteMap.put(5, minute5);
        minuteMap.put(6, minute6);
        minuteMap.put(7, minute7);
        minuteMap.put(8, minute8);
        minuteMap.put(9, minute9);
        minuteMap.put(10, minute10);
        minuteMap.put(11, minute11);
        minuteMap.put(12, minute12);
    }

    private void setupTime() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        this.hours = cal.get(Calendar.HOUR_OF_DAY);
        this.minutes = cal.get(Calendar.MINUTE);

    }


    private void updateClockFace() {
        for (int i = 1; i <= 12; i++) {
            i.getValue().setFill(Color.BLUE);
        }
        hourMap.get(this.hours).setFill(Color.RED);
        minuteMap.get(this.minutes/5).setFill(Color.GREEN);
    }


    @FXML
    private void setTime() {
        String hourInput = this.hourTextfield.getText();
        String minuteInput = this.minuteTextfield.getText();

        this.hours = Integer.parseInt(hourInput);
        this.minutes = Integer.parseInt(minuteInput);
        updateClockFace();
    }

    @FXML
    private void helloWorld() {

    }

}
