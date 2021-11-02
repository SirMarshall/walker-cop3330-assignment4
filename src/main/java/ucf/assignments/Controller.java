package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Controller {

    @FXML
    private Button deleteTask;

    @FXML
    private Button editTask;

    @FXML
    private ListView<?> listView;

    @FXML
    private Button markAsDone;

    @FXML
    private MenuItem newTaskButton;

    @FXML
    private Label taskDescription;

    @FXML
    private Label taskDueDate;

    @FXML
    private ListView<?> taskView;

    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

}
