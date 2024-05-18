/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_10.GradeBookApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * User interface for grade management
 */
public class SiefkenGradeBookApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Declare private control variables
     */
    private Label lblFirstName = new Label("First Name");
    private TextField txfFirstName = new TextField();
    private Label lblLastName = new Label("Last Name");
    private TextField txfLastName = new TextField();
    private Label lblCourse = new Label("Course");
    private TextField txfCourse = new TextField();
    private Label lblGrade = new Label("Grade");
    private ComboBox<String> cmbGrade = new ComboBox<String>();
    private Button btnClear = new Button("Clear");
    private Button btnSave = new Button("Save");
    private Button btnView = new Button("View Grades");
    private TextArea txaResults = new TextArea();

    @Override
    public void start(Stage primaryStage) {
        // set the stage's title
        primaryStage.setTitle("Siefken Grade Book App");

        // set up a grid pane for holding the controls
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        // row 0 - first name label and text field
        gridPane.add(lblFirstName, 0, 0);
        gridPane.add(txfFirstName, 1, 0);

        // row 1 - last name label and text field
        gridPane.add(lblLastName, 0, 1);
        gridPane.add(txfLastName, 1, 1);

        // row 2 - course label and text field
        gridPane.add(lblCourse, 0, 2);
        gridPane.add(txfCourse, 1, 2);

        // row 3 - grade label and combo box
        gridPane.add(lblGrade, 0, 3);
        cmbGrade.getItems().add("A");
        cmbGrade.getItems().add("B");
        cmbGrade.getItems().add("C");
        cmbGrade.getItems().add("D");
        cmbGrade.getItems().add("F");
        gridPane.add(cmbGrade, 1, 3);

        // row 4 - clear and save buttons
        gridPane.add(btnClear, 0, 4);
        gridPane.add(btnSave,  1, 4);

        // row 5 - view grades button
        gridPane.add(btnView, 0, 5);

        // row 6 - results text area
        txaResults.setEditable(false);
        gridPane.add(txaResults, 0, 6, 2, 1);

        // add the grid pane to the scene, set scene, and show the stage
        Scene scene = new Scene(gridPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
