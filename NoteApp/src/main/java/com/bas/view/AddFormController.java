package com.bas.view;

import com.bas.service.ICollectionController;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class AddFormController {
    Stage stage ;
    ICollectionController collectionController;
    MainFormController mainFormController;

    AddFormController(ICollectionController controller, MainFormController outerMainFormController) {
        collectionController = controller;
        mainFormController = outerMainFormController;
    }

    public AddFormController() {
    }

    @FXML
    void addButtonClick() {
        stage.close();
    }
}
