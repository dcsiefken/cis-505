package Module_9.Discussion;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CheeseEventListener implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        System.out.println("I love cheese.");
    }   
}
