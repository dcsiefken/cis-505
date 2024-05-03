/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_8.Discussion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class GradientExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private Rectangle redGreenRectangle = new Rectangle(100, 100);
    private Rectangle greenBlueRectangle = new Rectangle(100, 100);
    private Rectangle blueRedRectangle = new Rectangle(100, 100);

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Colors");

        GridPane gridPane = new GridPane();

        // linear gradient from red to green, left to right
        Stop[] redGreenStops = new Stop[] { new Stop(0, Color.RED), new Stop(1, Color.GREEN)};  
        LinearGradient redGreenGradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, redGreenStops); 
        redGreenRectangle.setFill(redGreenGradient);
        gridPane.add(redGreenRectangle, 0, 0);

        // linear gradient from green to blue, top left to bottom right
        Stop[] greenBlueStops = new Stop[] { new Stop(0, Color.GREEN), new Stop(1, Color.BLUE)};  
        LinearGradient greenBlueGradient = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE, greenBlueStops); 
        greenBlueRectangle.setFill(greenBlueGradient);
        gridPane.add(greenBlueRectangle, 1, 0);

        // radial gradient from blue to red inwards
        Stop[] blueRedStops = new Stop[] { new Stop(0, Color.RED), new Stop(1, Color.BLUE)};  
        RadialGradient blueRedGradient = new RadialGradient(0, .1, 50, 50, 50, false, CycleMethod.NO_CYCLE, blueRedStops); 
        blueRedRectangle.setFill(blueRedGradient);
        gridPane.add(blueRedRectangle, 2, 0);

        Scene scene = new Scene(gridPane, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}