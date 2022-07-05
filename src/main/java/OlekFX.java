import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class OlekFX extends Application implements EventHandler<ActionEvent> {
    OlekLosuLosu olekLosuLosu = new OlekLosuLosu();
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("OlekApp");
        button = new Button("Następny");
        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);



        Scene scene = new Scene(layout, 300, 250);
        scene.setFill(Color.RED);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button){
            System.out.println(olekLosuLosu.haslo());
        }
    }
}
