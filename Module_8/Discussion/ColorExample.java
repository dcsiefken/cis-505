/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_8.Discussion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private Rectangle redRectangle = new Rectangle(100, 100, Color.RED);
    private Rectangle greenRectangle = new Rectangle(100, 100, Color.valueOf("#00FF00"));
    private Rectangle blueRectangle = new Rectangle(100, 100, Color.rgb(0, 0, 255));

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Colors");

        GridPane gridPane = new GridPane();

        gridPane.add(redRectangle, 0, 0);
        gridPane.add(greenRectangle, 1, 0);
        gridPane.add(blueRectangle, 2, 0);

        Scene scene = new Scene(gridPane, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}