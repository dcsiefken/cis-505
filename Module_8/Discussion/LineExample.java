/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_8.Discussion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Playing with Lines");

        GridPane gridPane = new GridPane();

        Line line = new Line();
        line.setStartX(100);
        line.setStartY(10);
        line.setEndX(10);
        line.setEndY(110);

        line.setStroke(Color.RED);
        line.setStrokeWidth(10);
        line.getStrokeDashArray().addAll(0d, 20d);

        gridPane.add(line, 0, 0);

        Scene scene = new Scene(gridPane, 300, 110);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}