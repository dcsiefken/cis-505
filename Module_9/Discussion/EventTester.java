package Module_9.Discussion;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EventTester extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Event Tester App");
        GridPane gridPane = new GridPane();

        Button buttonApples = new Button("Apples");
        buttonApples.setOnAction(new AppleEventListener());

        Button buttonBread = new Button("Bread");
        buttonBread.setOnAction(new BreadEventListener());

        Button buttonCheese = new Button("Cheese");
        buttonCheese.setOnAction(new CheeseEventListener());

        gridPane.add(buttonApples, 0, 0);
        gridPane.add(buttonBread, 2, 0);
        gridPane.add(buttonCheese, 3, 0);

        Scene scene = new Scene(gridPane, 200, 30);
        primaryStage.setScene(scene);
        primaryStage.show();
    } 
}
