/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_8.Discussion;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Playing with Text");

        GridPane gridPane = new GridPane();

        Text text = new Text("This is a test.");
        text.setFill(Color.RED);
        text.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
        text.setWrappingWidth(75);
        text.setEffect(new GaussianBlur());

        gridPane.add(text, 0, 0);

        Scene scene = new Scene(gridPane, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}