/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
    Referenced https://www.digitalocean.com/community/tutorials/java-append-to-file for functionality
    Referenced https://stackoverflow.com/questions/3402735/what-is-simplest-way-to-read-a-file-into-string for functionality
*/

package Module_11.GradeBookApp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

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
        btnClear.setOnAction(e -> clearFormFields());
        gridPane.add(btnSave, 1, 4);
        btnSave.setOnAction(e -> saveFormFields());

        // row 5 - view grades button
        gridPane.add(btnView, 0, 5);
        btnView.setOnAction(e -> viewResults());

        // row 6 - results text area
        txaResults.setEditable(false);
        gridPane.add(txaResults, 0, 6, 2, 1);

        // add the grid pane to the scene, set scene, and show the stage
        Scene scene = new Scene(gridPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void clearFormFields() {
        // clear the data entry fields
        txfFirstName.clear();
        txfLastName.clear();
        txfCourse.clear();
        cmbGrade.setValue("");
    }

    private void appendTextToFile(String text, File file){
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(text);
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();    
        } catch (IOException ex) {
            System.out.println("Unable to append to file.");
        }
    }

    public void saveFormFields() {
        File gradesFile = new File("grades.csv");
        if (!gradesFile.exists()) {
            // if grades.csv does not exist, create the file and add the header first
            appendTextToFile("firstName,lastName,course,grade", gradesFile);
        }
        // write the form fields to the end of the file
        String firstName = txfFirstName.getText();
        String lastName = txfLastName.getText();
        String course = txfCourse.getText();
        String grade = cmbGrade.getValue();
        String gradeEntryLine = String.format("%s,%s,%s,%s", 
            firstName, lastName, course, grade);
        appendTextToFile(gradeEntryLine, gradesFile);
        clearFormFields();
    }

    public void viewResults() {
        // set the value of the text area to the contents of the grades file
        try {
            String gradesFileContent = 
                new String(
                    Files.readAllBytes(Paths.get("grades.csv")),
                    StandardCharsets.UTF_8);
            txaResults.setText(gradesFileContent);
        } catch (IOException ex){
            System.out.println("Unable to read from file.");
        }
    }
}
