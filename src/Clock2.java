import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Clock2 extends Application {

    private Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage;
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        Pane root = new Pane();
        btn.setLayoutX(250);
        btn.setLayoutY(220);
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    private void printClockFace() {
        Group group = new Group();

        Circle face = new Circle(100, Color.DARKGREEN);
        face.relocate(this.stage.getMaxWidth()/2, this.stage.getMaxHeight()/2);
        group.getChildren().add(face);

    }
}