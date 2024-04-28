package Module_7.FutureValueApp;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SiefkenFutureValueApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Declare private control variables
     */
    private TextField txfMonthlyPayment = new TextField();
    private TextField txfInterestRate = new TextField();
    private TextArea txaResult = new TextArea();
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years");
    // private Label notSureWhatGoesHere = new Label("?"); // instructions say 5 labels, but I only see 4
    private ComboBox<Integer> cmbYears = new ComboBox<Integer>();
    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage) {
        // set the stage's title
        primaryStage.setTitle("Siefken Future Value App");

        // set up a grid pane for holding the main controls
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        // row 0 - monthly payment label and text field
        gridPane.add(lblMonthlyPayment, 0, 0);
        gridPane.add(txfMonthlyPayment, 1, 0);

        // row 1 - interest rate label and text field
        gridPane.add(lblInterestRate, 0, 1);
        gridPane.add(txfInterestRate, 1, 1);

        // row 2 - interest rate format label
        lblInterestRateFormat.setTextFill(Color.RED);
        gridPane.add(lblInterestRateFormat, 1, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        // row 3 - years label and combo box
        gridPane.add(lblYears, 0, 3);
        gridPane.add(cmbYears, 1, 3);

        // row 4 - action buttons in an hbox
        HBox actionButtonContainer = new HBox();
        actionButtonContainer.setPadding(new Insets(15, 0, 15, 30));
        actionButtonContainer.setSpacing(10);
        actionButtonContainer.getChildren().add(btnClear);
        actionButtonContainer.getChildren().add(btnCalculate);
        gridPane.add(actionButtonContainer, 1, 4);

        // add the grid pane to the scene, set scene, and show the stage
        Scene scene = new Scene(gridPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}