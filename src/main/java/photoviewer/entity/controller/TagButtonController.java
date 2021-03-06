package photoviewer.entity.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import photoviewer.entity.model.core.unit.data.info.tagging.Tag;

public class TagButtonController {
    Tag tag;

    @FXML
    Button tagButton;
    @FXML
    Button delTagButton;

    @FXML
    public void initialize() {
    }

    public void initializeWithTag(Tag tag) {
        this.tag = tag;

        tagButton.setText(tag.toString());
    }
}
