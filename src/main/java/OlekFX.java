import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class OlekFX extends Application implements EventHandler<ActionEvent> {
    OlekLosuLosu olekLosuLosu = new OlekLosuLosu();
    Button button;
    Label odpowiedzi = new Label();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("OlekApp");
        button = new Button("Następny");
        button.setOnAction(this);
        //tekst




        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(30,30,30,30));
        //layout.getChildren().addAll(button);

        Text sceneTitle = new Text("Witam i zapraszam");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.BLACK, 20));
        layout.add(sceneTitle, 0, 0, 1, 1);
        layout.add(button, 0,1);
        layout.add(odpowiedzi,0,2);
        odpowiedzi.setText(olekLosuLosu.haslo());



        Scene scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        //tutaj błąd
        //https://docs.oracle.com/javafx/2/get_started/css.htm
        //scene.getStylesheets().add(OlekFX.class.getResource("Kolorki.css").toExternalForm());

        stage.show();

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button){
            //System.out.println(olekLosuLosu.haslo());
            odpowiedzi.setText(olekLosuLosu.haslo());

        }
    }
}
