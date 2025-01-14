package duke.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Represents the controller for the dialog box of the Duke application.
 */
public class DialogBox extends HBox {
    private static final String DUKE_BACKGROUND_STYLE = "-fx-background-color: #333333;";
    @FXML
    private final Label text;
    @FXML
    private final ImageView displayImage;

    /**
     * Constructs a dialog box that takes in a label and an image.
     *
     * @param label Label to be shown in the dialog box.
     * @param image Image to be shown in the dialog box.
     */
    private DialogBox(String label, Image image) {
        text = new Label(label);
        displayImage = new ImageView(image);

        text.setWrapText(true);
        displayImage.setFitWidth(50.0f);
        displayImage.setFitHeight(50.0f);

        setAlignment(Pos.CENTER_RIGHT);
        getChildren().addAll(text, displayImage);
    }

    /**
     * Flips the dialog box so that the image is to the left of the text.
     */
    private void flip() {
        setAlignment(Pos.CENTER_LEFT);
        ObservableList<Node> nodes = FXCollections.observableArrayList(this.getChildren());
        FXCollections.reverse(nodes);
        getChildren().setAll(nodes);
    }

    /**
     * Creates a user dialog box with label and image.
     *
     * @param label User's text to be shown.
     * @param image User's image to be shown.
     * @return User dialog box.
     */
    public static DialogBox getUserDialog(String label, Image image) {
        return new DialogBox(label, image);
    }

    /**
     * Create a duke dialog box with label and image.
     *
     * @param label Duke's text to be shown.
     * @param image Duke's image to be shown.
     * @return Duke dialog box.
     */
    public static DialogBox getDukeDialog(String label, Image image) {
        DialogBox dialogBox = new DialogBox(label, image);
        dialogBox.flip();
        dialogBox.setStyle(DUKE_BACKGROUND_STYLE);
        return dialogBox;
    }
}
